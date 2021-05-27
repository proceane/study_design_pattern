package tutorial.bridgeTutorial;

/**
 * 4. Shape를 extend한 클래스 생성
 * @date 		: 2021. 4. 28.
 */
public class Circle extends Shape{
	
	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawApi drawApi) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}
	
}
