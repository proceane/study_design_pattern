package prototypeTutorial;

/**
 * 2. Shape클래스를 확장한 Rectangle 클래스 생성
 * @date 		: 2021. 4. 26.
 */
public class Rectangle extends Shape{
	
	public Rectangle() {
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Rectangle :: draw() method.");
	}

}
