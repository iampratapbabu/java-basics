package project1.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MarioGame game = new MarioGame();
		//ChessGame game = new ChessGame();
		
		//GamingConsole game = new ChessGame();
		GamingConsole game = new MarioGame();
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
