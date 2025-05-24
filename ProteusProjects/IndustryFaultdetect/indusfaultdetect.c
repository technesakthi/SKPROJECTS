#include <Wire.h>
#include <Adafruit_BMP085.h>
#include <DHT.h>
#include <LiquidCrystal.h>

LiquidCrystal lcd(3,2,4,5,6,7);

Adafruit_BMP085 bmp;

// DHT11 Sensor
#define DHTPIN 13
#define DHTTYPE DHT11
DHT dht(DHTPIN, DHTTYPE);

// Other Pins
#define VIBRATION_SENSOR 8
#define BUZZER 9
#define RED_LED 10
#define GREEN_LED 11
#define RESET_BUTTON 12

// Threshold values
const int PRESSURE_THRESHOLD = 1000; // in hPa
const float TEMP_THRESHOLD = 40.0;   // in °C
const int VIBRATION_THRESHOLD = 1;   // 1 = detected

// Alarm state
bool faultDetected = false;

void setup() {
  pinMode(VIBRATION_SENSOR, INPUT);
  pinMode(BUZZER, OUTPUT);
  pinMode(RED_LED, OUTPUT);
  pinMode(GREEN_LED, OUTPUT);
  pinMode(RESET_BUTTON, INPUT_PULLUP);

  Serial.begin(9600);
  Wire.begin();

  lcd.init();
  lcd.backlight();
  lcd.setCursor(0, 0);
  lcd.print("Fault Detection");
  delay(2000);
  lcd.clear();

  dht.begin();
  if (!bmp.begin()) {
    lcd.setCursor(0, 0);
    lcd.print("BMP180 Error!");
    while (1);
  }
}

void loop() {
  // Read sensors
  float temperature = dht.readTemperature();
  float humidity = dht.readHumidity();
  int pressure = bmp.readPressure() / 100;
  int vibration = digitalRead(VIBRATION_SENSOR);

  // Debugging: Print sensor values to Serial Monitor
  Serial.print("Temp: ");
  Serial.print(temperature);
  Serial.print(" C, Pressure: ");
  Serial.print(pressure);
  Serial.print(" hPa, Vibration: ");
  Serial.println(vibration ? "YES" : "NO");

  // Display values on LCD
  lcd.setCursor(0, 0);
  lcd.print("Temp:");
  lcd.print(temperature);
  lcd.print(" C     ");

  lcd.setCursor(0, 1);
  lcd.print("Pres:");
  lcd.print(pressure);
  lcd.print(" hPa   ");

  lcd.setCursor(0, 2);
  lcd.print("Vib: ");
  lcd.print(vibration ? "YES " : "NO  ");

  // Fault detection condition
  if (temperature > TEMP_THRESHOLD || pressure > PRESSURE_THRESHOLD || vibration == VIBRATION_THRESHOLD) {
    faultDetected = true;
  }

  // Alarm handling based on fault flag
  if (faultDetected) {
    digitalWrite(BUZZER, HIGH);
    digitalWrite(RED_LED, HIGH);
    digitalWrite(GREEN_LED, LOW);
    lcd.setCursor(0, 3);
    lcd.print("Status: FAULT ");
    Serial.println("Status: FAULT");
  } else {
    digitalWrite(BUZZER, LOW);
    digitalWrite(RED_LED, LOW);
    digitalWrite(GREEN_LED, HIGH);
    lcd.setCursor(0, 3);
    lcd.print("Status: SAFE  ");
    Serial.println("Status: SAFE");
  }

  // Reset condition (button press clears alarm)
  if (digitalRead(RESET_BUTTON) == LOW) {
    faultDetected = false;
    digitalWrite(BUZZER, LOW);
    digitalWrite(RED_LED, LOW);
    digitalWrite(GREEN_LED, HIGH);
    lcd.setCursor(0, 3);
    lcd.print("Status: RESET ");
    Serial.println("Status: RESET");
    delay(1000);  // debounce delay
  }

  delay(500);  // Delay for stability
}
