package tutorial.bridgeTutorial;

/**
 * 5. main실행
 * @date 		: 2021. 4. 28.
 */
public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
		
		//인터페이스의 개념을 조금은 알것같다
	}

}
