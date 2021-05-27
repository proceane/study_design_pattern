package tutorial.builderTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Item객체가 있는 Meal클래스 생성
 * Meal = Burger + ColdDrink
 * Item은 버거, 음료수 모두 포함하기때문에(Burger와 ColdDrink가 Item을 구체화했기때문에)
 * Item에는 버거도, 음료수도 올수있음
 * Item들이 모여서 Meal이 됨
 * 
 * Item 추가, Item 가격 계산, 리스트출력하는 메소드가 있음 
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
