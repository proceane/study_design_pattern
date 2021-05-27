package tutorial.commandTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. 명령 호출용 클래스 생성
 * 명령을 담아서 한꺼번에 실행하는듯
 * @date 		: 2021. 5. 25.
 */
public class Broker {
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void placeOrders() {
		for(Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
