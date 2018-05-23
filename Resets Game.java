
	public void resetBall() {
		ballPosX = 340;
		ballPosY = 925;
		ball2PosX = 340;
		ball2PosY = 925;
		play = false;
		notBottom = true;
		repaint();
		mouseClicked = false;
	}

	//resets the game back to defaults but also adds new bricks
	public void resetGame() {	
		resetBall();
		totalBricks = 21 + (newBricks*7);
		score = 0;
		brickThisTurn = false;
		map = new MapGenerator(3 + newBricks,8);
		
