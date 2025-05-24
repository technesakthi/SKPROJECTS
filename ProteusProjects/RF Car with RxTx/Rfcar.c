char command;

void setup() {
  Serial.begin(9600);
  
  // Motor pins
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  
  // LED pins
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
}

void loop() {
  if (Serial.available()) {
    command = Serial.read();

    // Reset all motors and LEDs
    digitalWrite(8, LOW); digitalWrite(9, LOW);
    digitalWrite(10, LOW); digitalWrite(11, LOW);
    digitalWrite(2, LOW); digitalWrite(3, LOW);
    digitalWrite(4, LOW); digitalWrite(5, LOW);

    switch (command) {
      case 'W': // Forward
        digitalWrite(8, HIGH); digitalWrite(9, LOW);
        digitalWrite(10, HIGH); digitalWrite(11, LOW);
        digitalWrite(2, HIGH); // Green LED ON
        break;
        
      case 'S': // Backward
        digitalWrite(8, LOW); digitalWrite(9, HIGH);
        digitalWrite(10, LOW); digitalWrite(11, HIGH);
        digitalWrite(3, HIGH); // Red LED ON
        break;
        
      case 'A': // Left
        digitalWrite(8, LOW); digitalWrite(9, HIGH);
        digitalWrite(10, HIGH); digitalWrite(11, LOW);
        digitalWrite(4, HIGH); // yello LED ON
        break;
        
      case 'D': // Right
        digitalWrite(8, HIGH); digitalWrite(9, LOW);
        digitalWrite(10, LOW); digitalWrite(11, HIGH);
        digitalWrite(5, HIGH); // white LED ON
        break;
        
      case 'X': // Stop
        // All already set to LOW
        break;
    }
  }
}