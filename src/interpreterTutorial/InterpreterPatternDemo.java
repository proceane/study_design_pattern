package interpreterTutorial;

/**
 * 3. 메인 메소드 생성
 * @date 		: 2021. 5. 26.
 */
public class InterpreterPatternDemo {

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		System.out.println("John is male? : " + isMale.interpret("John"));
		System.out.println("Julie is a married women? : " + isMarriedWoman.interpret("Married Julie"));
		
		//객체를 표현하는 방식에 따라 클래스를 구분?
		//SQL구문분석, 기호처리 엔진에 사용된다고 하네요
	}
	
	static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

}
