package decoratorTutorial;

/**
 * 3. Shape를 구현한 추상클래스 생성
 * @date 		: 2021. 5. 23.
 */
public abstract class ShapeDecorator implements Shape {
	
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}

}
