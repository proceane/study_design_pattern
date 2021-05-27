package tutorial.visitorPattern;

/**
 * 2. computerpart인터페이스 구현
 * @date 		: 2021. 5. 27.
 */
public class Computer implements ComputerPart {
	
	ComputerPart[] parts;
	
	public Computer() {
		parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
