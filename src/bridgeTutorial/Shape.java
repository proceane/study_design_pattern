package bridgeTutorial;

/**
 * 3. Shape 추상클래스 생성
 * @date 		: 2021. 4. 28.
 */
public abstract class Shape {
	
	protected DrawApi drawApi;
	
	protected Shape(DrawApi drawApi) {
		this.drawApi = drawApi;
	}
	
	public abstract void draw();
}
