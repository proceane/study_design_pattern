package builderTutorial;

/**
 * 3. Item을 구체화한 추상클래스 Burger생성
 * @date 		: 2021. 4. 2.
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
