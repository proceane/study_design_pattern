package visitorPattern;

/**
 * 2. computerpart인터페이스 구현
 * @date 		: 2021. 5. 27.
 */
public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
