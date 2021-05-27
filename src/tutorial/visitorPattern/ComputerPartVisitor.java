package tutorial.visitorPattern;

/**
 * 3. visitor가 역할을 할 인터페이스 생성
 * @date 		: 2021. 5. 27.
 */
public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
