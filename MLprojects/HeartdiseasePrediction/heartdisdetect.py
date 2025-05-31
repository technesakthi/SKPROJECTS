from flask import Flask, render_template, request, redirect, url_for, session, flash
from flask_mysqldb import MySQL
import MySQLdb.cursors
import pickle
import numpy as np
from werkzeug.security import generate_password_hash, check_password_hash
from datetime import datetime
import os

app = Flask(__name__)
app.secret_key = 'sakthikumar92'

import db_config
app.config['MYSQL_HOST'] = db_config.MYSQL_HOST
app.config['MYSQL_USER'] = db_config.MYSQL_USER
app.config['MYSQL_PASSWORD'] = db_config.MYSQL_PASSWORD
app.config['MYSQL_DB'] = db_config.MYSQL_DB

mysql = MySQL(app)

model = pickle.load(open('heartml.pkl', 'rb'))

@app.route('/', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']

        cursor = mysql.connection.cursor(MySQLdb.cursors.DictCursor)
        cursor.execute('SELECT * FROM users WHERE username = %s', (username,))
        user = cursor.fetchone()

        if user and check_password_hash(user['password'], password):
            session['loggedin'] = True
            session['id'] = user['id']
            session['username'] = user['username']
            return redirect(url_for('predict'))
        else:
            flash('Incorrect username or password', 'danger')

    return render_template('login.html')

# Register route
@app.route('/register', methods=['GET', 'POST'])
def register():
    if request.method == 'POST':
        username = request.form['username']
        password = generate_password_hash(request.form['password'])

        cursor = mysql.connection.cursor()
        try:
            cursor.execute('INSERT INTO users (username, password) VALUES (%s, %s)', (username, password))
            mysql.connection.commit()
            flash('Account created successfully! Please log in.', 'success')
            return redirect(url_for('login'))
        except:
            flash('Username already exists.', 'warning')
            return redirect(url_for('register'))

    return render_template('register.html')

# Prediction form
@app.route('/predict', methods=['GET', 'POST'])
def predict():
    if 'loggedin' not in session:
        return redirect(url_for('login'))

    if request.method == 'POST':
        # Get input values
        inputs = [
            int(request.form['age']),
            int(request.form['sex']),
            int(request.form['cp']),
            int(request.form['trestbps']),
            int(request.form['chol']),
            int(request.form['fbs']),
            int(request.form['restecg']),
            int(request.form['thalach']),
            int(request.form['exang']),
            float(request.form['oldpeak']),
            int(request.form['slope']),
            int(request.form['ca']),
            int(request.form['thal']),
        ]
        input_np = np.array([inputs])
        result = int(model.predict(input_np)[0])

        # Save to DB
        cursor = mysql.connection.cursor()
        cursor.execute("""
            INSERT INTO patient_records (
                user_id, age, sex, cp, trestbps, chol, fbs, restecg, 
                thalach, exang, oldpeak, slope, ca, thal, result
            ) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)
        """, (session['id'], *inputs, result))
        mysql.connection.commit()

        prediction_msg = "High Risk of Heart Disease!" if result == 1 else "Low Risk – Looks Healthy!"
        return render_template('predict.html', prediction=prediction_msg)

    return render_template('predict.html')

@app.route('/records')
def records():
    if 'loggedin' not in session:
        return redirect(url_for('login'))

    cursor = mysql.connection.cursor(MySQLdb.cursors.DictCursor)
    cursor.execute("SELECT * FROM patient_records WHERE user_id = %s ORDER BY timestamp DESC", (session['id'],))
    records = cursor.fetchall()
    return render_template('records.html', records=records)


@app.route('/logout')
def logout():
    session.clear()
    return redirect(url_for('login'))

# Run app
if __name__ == '__main__':
    app.run(debug=True)
