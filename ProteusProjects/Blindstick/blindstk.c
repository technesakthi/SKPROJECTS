#define trig1 8
#define echo1 9
#define trig2 10
#define echo2 11
#define buzzer 12

void setup() {
  pinMode(trig1, OUTPUT);
  pinMode(echo1, INPUT);
  pinMode(trig2, OUTPUT);
  pinMode(echo2, INPUT);
  pinMode(buzzer, OUTPUT);
  Serial.begin(9600);
}

long readDistance(int trigPin, int echoPin) {
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
  long dist1 = readDistance(trig1, echo1);
  long dist2 = readDistance(trig2, echo2);

  Serial.print("Front: ");
  Serial.print(dist1);
  Serial.print(" cm | Side: ");
  Serial.print(dist2);
  Serial.println(" cm");

  if (dist1 < 300 || dist2 < 300) {
    digitalWrite(buzzer, HIGH);
     Serial.println("     ");
    Serial.println("OBSTACLE DETECTED!GO SAFE");
     Serial.println("     ");
  } else {
    digitalWrite(buzzer, LOW);
     Serial.println("     ");
    Serial.println("SAFE!!!");
     Serial.println("     ");
  }

  delay(200);
}