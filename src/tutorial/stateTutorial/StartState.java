package tutorial.stateTutorial;

/**
 * 2. state인터페이스 구현
 * @date 		: 2021. 5. 27.
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}
	
	public String toString() {
		return "Start State";
	}

}
