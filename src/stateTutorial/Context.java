package stateTutorial;

/**
 * 3. context 클래스 생성
 * @date 		: 2021. 5. 27.
 */
public class Context {
	private State state;
	
	public Context() {
		state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
