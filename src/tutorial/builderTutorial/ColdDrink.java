package tutorial.builderTutorial;

/**
 * 3. Item을 구체화한 추상클래스 ColdDrink생성
 * ColdDrink는 병으로 포장
 * 찬 음료 역시 음료마다 가격이 다름
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
