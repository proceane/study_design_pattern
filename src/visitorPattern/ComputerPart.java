package visitorPattern;

/**
 * 1. computerpart인터페이스 생성
 * @date 		: 2021. 5. 27.
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
