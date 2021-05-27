package tutorial.builderTutorial;

/**
 * 4. ColdDrink(추상클래스)를 확장한 Coke클래스 생성
 * Coke는 Coke라는 이름을 가지고 있고
 * 포장방식은 병(추상클래스인 Bottle)
 * 가격은 30.0
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
