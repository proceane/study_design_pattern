package observerTutorial;

/**
 * 3. observer클래스 상속
 * @date 		: 2021. 5. 27.
 */
public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));
	}

}
