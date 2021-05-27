package templateTutorial;

/**
 * 1. Game추상클래스 생성
 * @date 		: 2021. 5. 27.
 */
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//template method
	public final void play() {
		//initialize the game
		initialize();
		
		//start game
		startPlay();
		
		//end game
		endPlay();
	}
}
