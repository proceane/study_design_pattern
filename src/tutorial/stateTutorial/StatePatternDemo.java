package tutorial.stateTutorial;

/**
 * 4. 메인메소드 구현
 * @date 		: 2021. 5. 27.
 */
public class StatePatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		//상태에 따라 달라지는 클래스 동작을 구현하는 패턴이라고 하네용
		//상태를 나타내는 객체와 상태 객체가 변경됨에 따라 동작이 달라지는 컨텍스트 객체를 만듭니다
	}

}
