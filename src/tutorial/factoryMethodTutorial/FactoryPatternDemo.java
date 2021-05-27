package tutorial.factoryMethodTutorial;

/**
 * 4. main을 실행할 FactoryPatternDemo 클래스 생성
 * @date 		: 2021. 4. 6.
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//예제가 Factory패턴이랑 같음
	}

}
