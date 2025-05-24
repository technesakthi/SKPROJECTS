#include <Servo.h>

#define TRIG_PERSON 2
#define ECHO_PERSON 3
#define TRIG_LEVEL 4
#define ECHO_LEVEL 5
#define DUSTBIN_FULL_INDICATOR 6  // Optional: LED or output signal

Servo lidServo;

void setup() {
  Serial.begin(9600);
  
  pinMode(TRIG_PERSON, OUTPUT);
  pinMode(ECHO_PERSON, INPUT);
  
  pinMode(TRIG_LEVEL, OUTPUT);
  pinMode(ECHO_LEVEL, INPUT);

  pinMode(DUSTBIN_FULL_INDICATOR, OUTPUT);

  lidServo.attach(9); // Connect servo to pin 9
  lidServo.write(0); // Initial lid closed
}

long getDistance(int trigPin, int echoPin) {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  long duration = pulseIn(echoPin, HIGH);
  long distance = duration * 0.034 / 2;
  return distance;
}

void loop() {
  long personDistance = getDistance(TRIG_PERSON, ECHO_PERSON);
  long levelDistance = getDistance(TRIG_LEVEL, ECHO_LEVEL);

  // Check for person near the bin
  if (personDistance <= 15) { // You can adjust the range
    lidServo.write(90);  // Open lid
    delay(3000);         // Wait for trash
    lidServo.write(0);   // Close lid
  }

  // Check if dustbin is full
  if (levelDistance <= 5) {  // If trash is near sensor, it's full
    digitalWrite(DUSTBIN_FULL_INDICATOR, HIGH); // Show full (1)
    Serial.println("Dustbin Full: 1");
  } else {
    digitalWrite(DUSTBIN_FULL_INDICATOR, LOW); // Show not full (0)
    Serial.println("Dustbin Full: 0");
  }

  delay(1000);
}
