package tutorial.prototypeTutorial;

/**
 * 2. Shape클래스를 확장한 Circle 클래스 생성
 * @date 		: 2021. 4. 26.
 */
public class Circle extends Shape{
	
	public Circle() {
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Circle :: draw() method.");
	}

}
