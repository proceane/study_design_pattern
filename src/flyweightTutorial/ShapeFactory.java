package flyweightTutorial;

import java.util.HashMap;

/**
 * 3. 주어진 정보를 기반으로 객체를 만드는 클래스 생성
 * @date 		: 2021. 5. 24.
 */
public class ShapeFactory {
	private static final HashMap<String, Circle> circleMap = new HashMap<>();
	
	public static Shape getCircle(String color) {
		Circle circle = circleMap.get(color);
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
