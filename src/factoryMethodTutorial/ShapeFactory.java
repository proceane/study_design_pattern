package factoryMethodTutorial;

/**
 * 3. Shape들을 생성할 ShapeFactory클래스 생성
 * @date 		: 2021. 4. 6.
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
		else if(shapeType.equalsIgnoreCase("SQUARE")) return new Square();
		
		return null;
	}
}
