// Ball-klassen
class Ball {
  float x;
  float y;
  float dia;
  float speedX = 8;
  float speedY = random(-8, 8);

  // Konstruktør til bolden
  Ball(float x, float y, float dia) {
    this.x = x;
    this.y = y;
    this.dia = dia;
  }

  // Tegn bolden
  void getBall() {
    fill(255);
    stroke(255);
    rectMode(CENTER);
    ellipse(x, y, dia, dia);
  }

  // Tjek om bolden rammer spiller 2's pad
  void ballHitPadR(Paddle p) {
    if (speedX > 0 && x + dia / 2 > p.padX - p.w / 2 && y < p.padY + p.h / 2 && y > p.padY - p.h / 2) {
      speedX *= -1;
    }
  }

  // Tjek om bolden rammer spiller 1's pad
  void ballHitPadL(Paddle p) {
    if (speedX < 0 && x - dia / 2 < p.padX + p.w / 2 && y < p.padY + p.h / 2 && y > p.padY - p.h / 2) {
      speedX *= -1;
    }
  }

  // Opdater boldens position
  void getMoving() {
    x = x + speedX;
    y = y + speedY;
  }

  // Håndter boldens bevægelse langs siderne og opdater scores
  void sides() {
    if (y < 0 || y > height) {
      speedY *= -1;
    }
    if (x > width) {
      leftScore++;
      reset();
    }
    if (x < 0) {
      rightScore++;
      reset();
    }
  }

  // Nulstil boldens position
  void reset() {
    x = width / 2;
    y = height / 2;
  }
}
