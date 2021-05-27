package tutorial.builderTutorial;

/**
 * 4. Burger(추상클래스)를 확장한 VegBurger클래스 생성
 * VegBurger는 Veg Burger라는 이름을 가지고 있고
 * 포장방식은 포장지(추상클래스인 Burger)
 * 가격은 25.0
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
