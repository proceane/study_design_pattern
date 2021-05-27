package observerTutorial;

/**
 * 3. observer클래스 상속
 * @date 		: 2021. 5. 27.
 */
public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hex String : " + Integer.toHexString(subject.getState()).toUpperCase());
	}

}
