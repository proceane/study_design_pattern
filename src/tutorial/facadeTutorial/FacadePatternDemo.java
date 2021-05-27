package tutorial.facadeTutorial;

/**
 * 4. 메인메소드 생성
 * @date 		: 2021. 5. 24.
 */
public class FacadePatternDemo {

	public static void main(String[] args) {
		//ShapeMaker가 객체 여러개를 한번에 만들어주는 역할을 하는듯
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
