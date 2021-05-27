package tutorial.builderTutorial;

/**
 * 2. Packing 인터페이스를 구현한 Bottle클래스 생성
 * 포장 -> 병으로 구체화
 * @date 		: 2021. 4. 2.
 */
public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
