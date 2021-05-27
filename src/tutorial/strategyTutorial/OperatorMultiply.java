package tutorial.strategyTutorial;

/**
 * 2. strategy인터페이스 구현
 * 곱셈
 * @date 		: 2021. 5. 27.
 */
public class OperatorMultiply implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}

}
