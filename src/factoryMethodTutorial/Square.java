package factoryMethodTutorial;

/**
 * 2. Shape를 구체화한 Square클래스 생성
 * @date 		: 2021. 4. 6.
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square :: draw() method");
	}

}
