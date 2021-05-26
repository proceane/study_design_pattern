package interpreterTutorial;

/**
 * 2. expression 인터페이스 구현
 * @date 		: 2021. 5. 26.
 */
public class TerminalExpression implements Expression {
	
	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	
	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) {
			return true;
		}
		return false;
	}

}
