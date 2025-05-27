from flask import Flask, request, render_template
import pickle
import numpy as np

app = Flask(__name__)
model = pickle.load(open("creditfraudmodel.pkl", "rb"))

@app.route("/")
def home():
    return render_template("index.html")

@app.route("/predict", methods=["POST"])
def predict():
    feature1 = float(request.form["feature1"])
    feature2 = float(request.form["feature2"])
    data = np.array([[feature1, feature2]])
    prediction = model.predict(data)[0]
    return render_template("index.html", prediction_text=f"Predicted Class: {prediction}")

if __name__ == "__main__":
    app.run(debug=True)
