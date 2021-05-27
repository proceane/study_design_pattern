package tutorial.templateTutorial;

/**
 * 2. Game클래스 상속
 * @date 		: 2021. 5. 27.
 */
public class Football extends Game {

	@Override
	void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game Initialized! Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game Finished!");
	}
	
}
