package tutorial.factoryMethodTutorial;

/**
 * 2. Shape를 구현한 Rectangle클래스 생성
 * @date 		: 2021. 4. 6.
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle :: draw() method");
	}

}
