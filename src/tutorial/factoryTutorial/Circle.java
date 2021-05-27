package tutorial.factoryTutorial;

/**
 * 2. Shape인터페이스를 구체화한 Circle클래스 생성
 * @date 		: 2021. 4. 5.
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle :: draw() method");
	}

}
