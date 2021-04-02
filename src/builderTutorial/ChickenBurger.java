package builderTutorial;

/**
 * 4. Burger(추상클래스)를 확장한 ChickenBurger클래스 생성
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
