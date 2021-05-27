package tutorial.builderTutorial;

/**
 * 3. Item을 구체화한 추상클래스 Burger생성
 * Burger는 포장지로 포장한것
 * Burger의 가격은 버거종류마다 다르기때문에 abstract변수로 지정
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
