package tutorial.builderTutorial;

/**
 * 4. ColdDrink(추상클래스)를 확장한 Pepsi클래스
 * Pepsi는 Pepsi라는 이름을 가지고 있고
 * 포장방식은 병(추상클래스인 Bottle)
 * 가격은 35.0
 * @date 		: 2021. 4. 2.
 */
public class Pepsi extends ColdDrink{

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
