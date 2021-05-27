package tutorial.commandTutorial;

/**
 * 3. Order인터페이스 구현
 * @date 		: 2021. 5. 25.
 */
public class SellStock implements Order {
	
	private Stock abcStock;
	
	public SellStock(Stock stock) {
		this.abcStock = stock;
	}
	
	@Override
	public void execute() {
		abcStock.sell();
	}

}
