package tutorial.mementoTutorial;

/**
 * 1. Memento클래스 생성
 * @date 		: 2021. 5. 27.
 */
public class Memento {
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
