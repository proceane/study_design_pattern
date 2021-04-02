package builderTutorial;

/**
 * 3. Item을 구체화한 추상클래스 ColdDrink생성
 * @date 		: 2021. 4. 2.
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
