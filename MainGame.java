import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGame {

	
	public static void main(String[] args)  {
		
		JFrame gameFrame = new JFrame();

		Gameplay gameplay = new Gameplay();
		
		gameFrame.setSize(700,1000);
		gameFrame.setTitle("Brick Breaker");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.add(gameplay);
		gameFrame.setVisible(true);
		
	}
	
	

	

}
