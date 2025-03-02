#include <LiquidCrystal.h>
#include <DHT.h>
#include <SoftwareSerial.h>

// Define LCD Pins: RS, E, D4, D5, D6, D7
LiquidCrystal lcd(12, 11, 10, 9, 8, 7);

//DHT Sensor
#define DHTPIN 13      
#define DHTTYPE DHT11
DHT dht(DHTPIN, DHTTYPE);

//Bluetooth HC-05
SoftwareSerial BT(0, 1);  // (RX, TX)

// Define Sensor Pins
#define ANEMOMETER_PIN 2   // (Digital)
#define WIND_VANE A0       // (Analog)
#define GAS_SENSOR 3       // (Digital)
#define RAIN_SENSOR 4      // (Digital)
#define BT_LED 6           // LED Indicator for Bluetooth

volatile unsigned long lastPulseTime = 0;
volatile float windSpeed = 0.0;
const float calibrationFactor = 2.3;

void measureWindSpeed() {
    unsigned long currentTime = micros(); 
    if (lastPulseTime > 0) {
        float timeDifference = (currentTime - lastPulseTime) / 1e6; 
        windSpeed = (1 / timeDifference) / calibrationFactor * 3.6; 
    }
    lastPulseTime = currentTime;
}

void setup() {
    lcd.begin(16, 2);
    dht.begin();
    BT.begin(9600);
    pinMode(GAS_SENSOR, INPUT);
    pinMode(RAIN_SENSOR, INPUT);
    pinMode(ANEMOMETER_PIN, INPUT_PULLUP);
    pinMode(BT_LED, OUTPUT);
    
    attachInterrupt(digitalPinToInterrupt(ANEMOMETER_PIN), measureWindSpeed, RISING);


    lcd.setCursor(0, 0);
    lcd.print("Weather Monitor");
    delay(2000);
    lcd.clear();
}

void loop() {

    float humidity = dht.readHumidity();
    float temperature = dht.readTemperature();

    int windValue = analogRead(WIND_VANE);
    String windDirection = getWindDirection(windValue);

    int airQuality = digitalRead(GAS_SENSOR);
    String airStatus = (airQuality == HIGH) ? "Poor" : "Good";

    int rainStatus = digitalRead(RAIN_SENSOR);
    String rainCondition = (rainStatus == LOW) ? "Raining" : "No Rain";

    lcd.setCursor(0, 0);
    lcd.print("H:");
    lcd.print(humidity);
    lcd.print("% T:");
    lcd.print(temperature);
    lcd.print("C");

    lcd.setCursor(0, 1);
    lcd.print("W:");
    lcd.print(windSpeed*1.48, 2);
    lcd.print("km/h ");
    lcd.print(windDirection);

    delay(2000);
    lcd.clear();

    lcd.setCursor(0, 0);
    lcd.print("Air: ");
    lcd.print(airStatus);

    lcd.setCursor(0, 1);
    lcd.print("Rain: ");
    lcd.print(rainCondition);

    delay(2000);
    lcd.clear();

    digitalWrite(BT_LED, HIGH);
    BT.println("\n---Weather Data---");
    BT.print("Humidity: "); BT.print(humidity); BT.println(" %");
    BT.print("Temperature: "); BT.print(temperature); BT.println(" C");
    BT.print("Wind Speed: "); BT.print(windSpeed*1.48, 2); BT.println(" km/h");
    BT.print("Wind Direction: "); BT.println(windDirection);
    BT.print("Air Quality: "); BT.println(airStatus);
    BT.print("Rain Status: "); BT.println(rainCondition);
    BT.println("------------------");
    digitalWrite(BT_LED, LOW);

    delay(2000);
}

String getWindDirection(int value) {
    if (value == 238 || value == 321 || value == 618) return "N";
    else if (value == 563) return "NE";
    else if (value == 940 || value == 931 || value == 958) return "E";
    else if (value == 839) return "SE";
    else if (value == 897 || value == 737 || value == 779) return "S";
    else if (value == 394) return "SW";
    else if (value == 425 || value == 79 || value == 196) return "W";
    else if (value == 137) return "NW";
    else return "Unknown";
}
