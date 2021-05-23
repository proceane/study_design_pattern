package decoratorTutorial;

/**
 * 4. ShapeDecorator를 상속한 클래스 생성
 * @date 		: 2021. 5. 23.
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color : Red");
	}

}
