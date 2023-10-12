
// Opret objekter til bold og paddles samt initialiser scores.
Ball ballS;
Paddle paddle1;
Paddle paddle2;
int leftScore=0;
int rightScore=0;
void setup() {
  background(0);
  //size(500,500);

  fullScreen();

  // boldens placering
  ballS = new Ball(width/2, height/2, 20);


  //player 1 placering
  paddle1 = new Paddle(30, height/2);

  //player2 placering

  paddle2 = new Paddle(width-30, height/2);
}


void draw() {
  background(0);
// Opdater boldens position og bevægelse
  ballS.getBall();
  ballS.getMoving();
  ballS.sides();
  
  // Tjek om bolden rammer spiller 2 pad (højre)
  ballS.ballHitPadR(paddle2);
  
  // Tjek om bolden rammer spiller 1 pad (venstre)
  ballS.ballHitPadL(paddle1);

  // Opdater og tegn spiller 1's pad
  paddle1.getPaddle();
  
  // Opdater og tegn spiller 2's pad
  paddle2.getPaddle();

  // Flyt spiller 1's pad baseret på tastetryk
  paddle1.getMovePad1();

  // Flyt spiller 2's pad baseret på tastetryk
  paddle2.getMovePad2();
  
  // scoren
  fill(255);
  textSize(30);
  text(leftScore, 32, 40);
  text(rightScore, width-32, 40);
  
}

 void keyReleased(){
   // Stop bevægelsen af begge paddles, når tasten frigives.
  
  paddle1.getMovePad1();
  paddle2.getMovePad2();
  }
