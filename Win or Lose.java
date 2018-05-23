
	public void winState() {
		//Put in win dialog box
		JDialog.setDefaultLookAndFeelDecorated(true);
		int res = JOptionPane.showConfirmDialog(null,"Do you want to play again?", "Confirm Dialog Box", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
			if (res == JOptionPane.NO_OPTION|| res == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
				
			}
			else {
				if (res == JOptionPane.YES_OPTION) {
					newBricks++;
					resetGame();
				}
			}
	}
	public void loseState() {
		JDialog.setDefaultLookAndFeelDecorated(true);
		int lose = JOptionPane.showConfirmDialog(null,"LOSER: Do you want to play again?", "Confirm Dialog Box", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
		if (lose == JOptionPane.NO_OPTION|| lose == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		else {
			if (lose == JOptionPane.YES_OPTION) {
				resetGame();
			}
		}
	}
