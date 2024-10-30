package src.test.java.com.practice.demo;

import src.test.java.com.practice.demo.game.GameRunner;
import src.test.java.com.practice.demo.game.MarioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}
}
