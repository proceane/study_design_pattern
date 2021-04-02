package builderTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Item객체가 있는 Meal클래스 생성
 * @date 		: 2021. 4. 2.
 */
public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for(Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for(Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
