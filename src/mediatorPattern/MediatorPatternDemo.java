package mediatorPattern;

/**
 * 3. 메인 메소드 생성
 * @date 		: 2021. 5. 27.
 */
public class MediatorPatternDemo {

	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert");
		
		//서로의 대화를 전달해주는 역할을 하는듯
	}

}
