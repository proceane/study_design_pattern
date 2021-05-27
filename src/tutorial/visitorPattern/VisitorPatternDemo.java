package tutorial.visitorPattern;

/**
 * 5. 메인메소드 생성
 * @date 		: 2021. 5. 27.
 */
public class VisitorPatternDemo {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
		
		//방문자가 누구냐에 따라 달라지는게 방문자 패턴인가봄
		//display방문자가 왔으니 display하고
		//다른 방문자를 만들고싶으면 ComputerPartVisitor 인터페이스를 받아서 구현하면되는듯
	}

}
