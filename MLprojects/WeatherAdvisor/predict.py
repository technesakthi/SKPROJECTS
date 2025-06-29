import requests
import pandas as pd
import joblib


clf = joblib.load("rain_classifier.pkl")
reg = joblib.load("rain_regressor.pkl")
scaler = joblib.load("scaler.pkl")


API_KEY = "1aa5edb243543bee906f39e31ea5f258"
CITY = input()


url = f"https://api.openweathermap.org/data/2.5/weather?q={CITY}&appid={API_KEY}&units=metric"
response = requests.get(url)
data = response.json()
print("🪵 Raw API response:", data)



try:
    weather_input = {
        'Humidity3pm': data['main']['humidity'],
        'Pressure9am': data['main']['pressure'],
        'Temp3pm': data['main']['temp'],
        'Cloud3pm': data['clouds']['all'],
        'WindSpeed3pm': data['wind']['speed'],
        'RainToday': 1 if 'rain' in data else 0
    }

    # Format and scale input
    X_new = pd.DataFrame([weather_input])
    X_new_scaled = scaler.transform(X_new)

    # Predict Rain/No Rain
    rain_pred = clf.predict(X_new_scaled)[0]
    rain_prob = clf.predict_proba(X_new_scaled)[0][1]

    print(f"\n📍 Location: {CITY}")
    print("🌡️ Weather Input:", weather_input)

    if rain_pred == 1:
        rain_amount = reg.predict(X_new_scaled)[0]
        print(f"🌧️ Rain expected with {rain_prob * 100:.2f}% probability.")
        print(f"🌧️ Estimated rainfall: {rain_amount:.2f} mm")
    else:
        print(f"☀️ No rain expected. Probability of rain: {rain_prob * 100:.2f}%.")
except Exception as e:
    print("❌ Error processing weather data:", e)
