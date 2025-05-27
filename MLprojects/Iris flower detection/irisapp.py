from flask import Flask, render_template, request
import pickle
import numpy as np

app = Flask(__name__)

model = pickle.load(open("iris_model.pkl", "rb"))

@app.route('/')
def home():
    return render_template("index.html")

@app.route('/predict', methods=["POST"])
def predict():
    try:
        data = [float(request.form[f"feature{i}"]) for i in range(1, 5)]
        prediction = model.predict([np.array(data)])[0]
        flower_names = ["Setosa", "Versicolor", "Virginica"]
        return render_template("index.html", prediction_text=f"Predicted Flower: {flower_names[prediction]}")
    except:
        return render_template("index.html", prediction_text="Invalid input. Please enter valid numbers.")

if __name__ == '__main__':
    app.run(debug=True)
