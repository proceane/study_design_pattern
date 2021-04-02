package builderTutorial;

/**
 * 4. Burger(추상클래스)를 확장한 VegBurger클래스 생성
 * @date 		: 2021. 4. 2.
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
