package tutorial.strategyTutorial;

/**
 * 3. context클래스 생성
 * @date 		: 2021. 5. 27.
 */
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
