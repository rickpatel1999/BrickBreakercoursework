		
public void paint(Graphics g) {

		//ball
		g.setColor(Color.RED);
		g.fillOval(ballPosX, ballPosY, 20, 20);			

		//background
		g.setColor(Color.black);
		g.fillRect(1, 1, 700, 1000);
		
		//Clicks
		g.setColor(Color.white);
		g.setFont(new Font("serif",Font.BOLD, 25));
		
		
		//drawing Map
		
		map.draw((Graphics2D)g);
		if (map.bricksBottom == true) {
			loseState();
		}
		
		//border
		g.setColor(Color.RED);
		g.fillRect(0, 0, 3, 1000);
		g.fillRect(0, 0, 700, 3);
		g.fillRect(697, 0, 3, 1000);
		
		//launcher
		g.setColor(Color.white);
		g.fillRect(340, 950, 20, 50);

		
		g.dispose();
	}  
