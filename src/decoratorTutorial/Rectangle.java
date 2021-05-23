package decoratorTutorial;

/**
 * 2. Shape인터페이스 구현
 * @date 		: 2021. 5. 23.
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape : Rectangle");
	}

}
