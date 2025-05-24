#include <Wire.h>
#include <RTClib.h>
#include <Servo.h>
#include <LiquidCrystal.h>

RTC_DS1307 rtc;
Servo dispenser;
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

// Pins
const int buzzer = 8;
const int button = 7;

// Reminder time
int setHour = -1;
int setMinute = -1;

// Input handling
String inputString = "";
bool inputComplete = false;

// Prevent multiple triggers in same minute
int lastTriggerMinute = -1;

void setup() {
  Serial.begin(9600);
  Wire.begin();
  rtc.begin();
  dispenser.attach(9);
  pinMode(buzzer, OUTPUT);
  pinMode(button, INPUT);
  lcd.begin(16, 2);
  dispenser.write(0);

  lcd.print("Waiting for time");
  Serial.println("Enter reminder time (HH:MM):");

  inputString.reserve(10); // Reserve memory for input
}

void loop() {
  // Handle serial input
  if (inputComplete) {
    parseTimeInput(inputString);
    inputString = "";
    inputComplete = false;
    lcd.clear();
  }

  // Skip if no valid time is set yet
  if (setHour == -1 || setMinute == -1) return;

  DateTime now = rtc.now();

  // Display current time
  lcd.setCursor(0, 0);
  lcd.print("Now: ");
  printTimeToLCD(now.hour(), now.minute());

  // Trigger medicine reminder
  if (now.hour() == setHour && now.minute() == setMinute && lastTriggerMinute != now.minute()) {
    lcd.setCursor(0, 1);
    lcd.print("Take Medicine!");
    digitalWrite(buzzer, HIGH);
    dispenser.write(90);

    // Wait until button is pressed
    while (digitalRead(button) == LOW);

    digitalWrite(buzzer, LOW);
    dispenser.write(0);
    lcd.clear();
    lcd.print("Taken! Good job!");
    delay(3000);

    lastTriggerMinute = now.minute(); // Prevent retriggering same minute
  }

  delay(1000);
}

// Serial event — read input
void serialEvent() {
  while (Serial.available()) {
    char inChar = (char)Serial.read();
    if (inChar == '\n' || inChar == '\r') {
      inputComplete = true;
    } else {
      inputString += inChar;
    }
  }
}

// Parse "HH:MM"
void parseTimeInput(String timeStr) {
  int colonIndex = timeStr.indexOf(':');
  if (colonIndex == -1) {
    Serial.println("Invalid format. Use HH:MM");
    return;
  }

  int h = timeStr.substring(0, colonIndex).toInt();
  int m = timeStr.substring(colonIndex + 1).toInt();

  if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
    setHour = h;
    setMinute = m;
    lastTriggerMinute = -1; // Reset last trigger for new time
    Serial.print("Reminder set at ");
    Serial.print(setHour);
    Serial.print(":");
    if (setMinute < 10) Serial.print("0");
    Serial.println(setMinute);

    lcd.clear();
    lcd.print("Reminder: ");
    printTimeToLCD(setHour, setMinute);
  } else {
    Serial.println("Invalid time. Try again.");
  }
}

// Print time in HH:MM
void printTimeToLCD(int h, int m) {
  if (h < 10) lcd.print("0");
  lcd.print(h);
  lcd.print(":");
  if (m < 10) lcd.print("0");
  lcd.print(m);
}
