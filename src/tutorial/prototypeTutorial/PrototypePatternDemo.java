package tutorial.prototypeTutorial;

/**
 * 4. 해시테이블에 저장된 모양의 클론을 가져와서 ShapeCache 클래스를 사용하는 메인클래스
 * @date 		: 2021. 4. 26.
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
		
		//프로토타입 패턴에서 객체를 사용할때 원본을 사용하는게 아니라 clone을 사용하는건가?
		
	}

}
