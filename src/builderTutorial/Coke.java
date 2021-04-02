package builderTutorial;

/**
 * 4. ColdDrink(추상클래스)를 확장한 Coke클래스 생성
 * @date 		: 2021. 4. 2.
 */
public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}
	
	
}
