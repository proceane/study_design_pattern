package tutorial.prototypeTutorial;

/**
 * 2. Shape클래스를 확장한 Square 클래스 생성
 * @date 		: 2021. 4. 26.
 */
public class Square extends Shape{

	public Square() {
		type = "square";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Square :: draw() method.");
	}

}
