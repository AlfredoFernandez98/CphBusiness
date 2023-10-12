//  Paddle-klassen
class Paddle {
  float padX, padY;
  float speed;
  int w = 10;
  int h = 100;

  // Konstruktør til paddle
  Paddle(float padX, float padY) {
    this.padX = padX;
    this.padY = padY;
  }

  // Tegn paddlen
  void getPaddle() {
    fill(255);
    rectMode(CENTER);
    rect(padX, padY, w, h);
    rect(padX, padY, w, h);
  }

  // Flyt paddlerne bliver aktiveret på tastetryk (w og s)
  void getMovePad1() {
    if (keyPressed) {
      if (key == 'w') {
        padY = constrain(padY - 10, h / 2, height - h / 2);
      } else if (key == 's') {
        padY = constrain(padY + 10, h / 2, height - h / 2);
      }
    }
  }

  
  void getMovePad2() {
    if (keyPressed) {
      if (key == 'o') {
        padY = constrain(padY - 10, h / 2, height - h / 2);
      } else if (key == 'l') {
        padY = constrain(padY + 10, h / 2, height - h / 2);
      }
    }
  }
}
