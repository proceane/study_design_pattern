package tutorial.observerTutorial;

/**
 * 3. observer클래스 상속
 * @date 		: 2021. 5. 27.
 */
public class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal String : " + Integer.toOctalString(subject.getState()));
	}

}
