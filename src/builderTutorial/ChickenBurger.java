package builderTutorial;

/**
 * 4. Burger(추상클래스)를 확장한 ChickenBurger클래스 생성
 * ChickenBurger는 Chicken Burger라는 이름을 가지고 있고
 * 포장방식은 포장지(추상클래스인 Burger)
 * 가격은 50.5
 * @date 		: 2021. 4. 2.
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
