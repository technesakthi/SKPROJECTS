from flask import Flask, render_template, request
import pickle
import numpy as np

app = Flask(__name__)
model = pickle.load(open('iris_model.pkl', 'rb'))  # Ensure this file exists

@app.route('/')
def home():
    return render_template('index.html')


@app.route('/predict', methods=['POST'])
def predict():
    try:
        sl = float(request.form['sepal_length'])
        sw = float(request.form['sepal_width'])
        pl = float(request.form['petal_length'])
        pw = float(request.form['petal_width'])

        features = np.array([[sl, sw, pl, pw]])
        predicted_class = model.predict(features)[0]

        label_map = {0: "Setosa", 1: "Versicolor", 2: "Virginica"}
        prediction = label_map[predicted_class]
        image_filename = f"{prediction}.jpg"
        return render_template('index.html', result=prediction, image=image_filename)



    except Exception as e:
        return f"Error: {e}"


if __name__ == '__main__':
    app.run(debug=True)
