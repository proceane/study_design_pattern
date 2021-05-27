package tutorial.factoryTutorial;

/**
 * 2. Shape인터페이스를 구체화한 Square클래스 생성
 * @date 		: 2021. 4. 5.
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square :: draw() method.");
	}

}
