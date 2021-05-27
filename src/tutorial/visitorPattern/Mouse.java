package tutorial.visitorPattern;

/**
 * 2. computerpart인터페이스 구현
 * @date 		: 2021. 5. 27.
 */
public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
