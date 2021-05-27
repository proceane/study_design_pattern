package observerTutorial;

/**
 * 2. Observer 추상 클래스 생성
 * @date 		: 2021. 5. 27.
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
