package builderTutorial;

/**
 * 4. ColdDrink(추상클래스)를 확장한 Pepsi클래스
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
