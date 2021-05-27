package tutorial.observerTutorial;

/**
 * 4. 메인 메소드 생성
 * @date 		: 2021. 5. 27.
 */
public class ObserverPatternDemo {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change : 15");
		subject.setState(15);
		System.out.println("\nSecond state change : 10");
		subject.setState(10);
		
		//하나의 개체가 여러개로 변할수 있을때 사용?
		//15를 set했을때 update메소드에 의해 출력되는데
		//처음에 hexa, octal, binary순으로 개체를 만들어서 그 순서대로 출력되는건가..
		
	}
}
