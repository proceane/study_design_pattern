package strategyTutorial;

/**
 * 4. 메인메소드 생성
 * @date 		: 2021. 5. 27.
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperatorMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		
		//연산하는 로직을 하나로 만들어서 관리하는 느낌
	}

}
