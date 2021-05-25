package proxyPattern;

/**
 * 3. 메인메소드 생성
 * @date 		: 2021. 5. 25.
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		
		image.display();
		System.out.println();
		
		image.display();
		
		//proxy가 중계, 대리역할을 한다는거니까
		//realImage와 연결하는 역할을 하는듯
	}

}
