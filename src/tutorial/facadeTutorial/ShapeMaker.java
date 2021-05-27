package tutorial.facadeTutorial;

/**
 * 3. facade클래스 생성
 * 객체들을 한번에 만들어주는 역할인듯
 * @date 		: 2021. 5. 24.
 */
public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	//왜 this가 아니지?
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	void drawCircle() {
		circle.draw();
	}
	
	void drawRectangle() {
		rectangle.draw();
	}
	
	void drawSquare() {
		square.draw();
	}
	
}
