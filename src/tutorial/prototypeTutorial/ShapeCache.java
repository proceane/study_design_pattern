package tutorial.prototypeTutorial;

import java.util.Hashtable;

/**
 * 3. 데이터베이스로부터 구체화된 클래스를 얻고 해시테이블에 저장하는 클래스를 생성
 * (원문 그대로 번역)
 * @date 		: 2021. 4. 26.
 */
public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);
		return (Shape) cacheShape.clone();
	}
	
	//데이터베이스 쿼리를 반복실행하여 shape를 만든다?
	//데이터베이스 = 해시테이블?
	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
