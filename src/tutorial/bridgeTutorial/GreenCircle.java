package tutorial.bridgeTutorial;

/**
 * 2. DrawApi를 구체화한 클래스 생성
 * @date 		: 2021. 4. 28.
 */
public class GreenCircle implements DrawApi {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y:" + y);
	}

}
