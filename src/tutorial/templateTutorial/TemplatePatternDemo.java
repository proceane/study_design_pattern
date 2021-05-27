package tutorial.templateTutorial;

/**
 * 3. 메인메소드 생성
 * @date 		: 2021. 5. 27.
 */
public class TemplatePatternDemo {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
		
		//최종적으로 실행되는 메소드는 추상클래스에 있고
		//그 메소드 안에 있는 추상메소드들은 상속된 클래스에서 구현되는방식인듯
	}

}
