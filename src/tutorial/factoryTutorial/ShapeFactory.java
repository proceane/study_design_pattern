package tutorial.factoryTutorial;

/**
 * 3. Shape를 만드는 Factory클래스 생성
 * @date 		: 2021. 4. 5.
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}
}
