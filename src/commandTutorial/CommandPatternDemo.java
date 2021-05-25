package commandTutorial;

/**
 * 5. 메인메소드 생성
 * @date 		: 2021. 5. 25.
 */
public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock abcStock = new Stock();
		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		
		broker.placeOrders();
		
		//명령어를 분류하고 실행자에게 주고 실행자가 한꺼번에 실행하는로직?
	}

}
