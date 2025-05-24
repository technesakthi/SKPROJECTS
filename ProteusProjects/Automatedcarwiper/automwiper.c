int analogRainPin = A0;      // Analog sensor for intensity
int digitalRainPin = 2;      // Digital sensor (0 = rain, 1 = no rain)

int motorPin = 3;            // PWM pin for motor speed
int wiperLED = 4;            // Wiper status indicator
int thresholdLED = 5;        // LED for intense rain

int rainThreshold = 300;     // Below this = heavy rain

void setup() {
  pinMode(analogRainPin, INPUT);
  pinMode(digitalRainPin, INPUT);
  pinMode(motorPin, OUTPUT);
  pinMode(wiperLED, OUTPUT);
  pinMode(thresholdLED, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  int analogRain = analogRead(analogRainPin);     // 0 = heavy rain
  int digitalRain = digitalRead(digitalRainPin);  // 0 = rain, 1 = no rain

  Serial.print("Rain Intensity: ");
  Serial.print(analogRain);
  Serial.print("   ");
  Serial.print("Rain: ");
  Serial.println(digitalRain?"NO Rain":"Raining");

  if (digitalRain == LOW) {
    // Rain detected: Map analog value to speed
    int motorSpeed = map(analogRain, 1023, 0, 100, 255);
    analogWrite(motorPin, motorSpeed);  // PWM signal to motor
    digitalWrite(wiperLED, HIGH);

    if (analogRain > rainThreshold) {
      digitalWrite(thresholdLED, HIGH);  // Heavy rain
    } else {
      digitalWrite(thresholdLED, LOW);   // Light rain
    }

    Serial.print("Motor Speed: ");
    Serial.println(motorSpeed);
  } else {
    // No rain: Stop motor and turn off LEDs
    analogWrite(motorPin, 0);
    digitalWrite(wiperLED, LOW);
    digitalWrite(thresholdLED, LOW);
    Serial.println("No Rain – Motor OFF");
  }

  delay(500);
}
