package builderTutorial;

/**
 * 2. Packing 인터페이스를 구현한 Wrapper클래스 생성
 * @date 		: 2021. 4. 2.
 */
public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
