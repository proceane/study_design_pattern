package commandTutorial;

/**
 * 2. 요청 클래스 생성
 * 명령이 담긴 클래스?
 * @date 		: 2021. 5. 25.
 */
public class Stock {
	
	private String name = "ABC";
	private int quantity = 10;
	
	public void buy() {
		System.out.println("Stock [ Name: " + name +
				"Quantity: " + quantity + " ] bought");
	}
	
	public void sell() {
		System.out.println("Stock [ Name: " + name +
				"Quantity: " + quantity + " ] sold");
	}
}
