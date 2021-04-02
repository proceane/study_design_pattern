package builderTutorial;

/**
 * 1. 상품 인터페이스 생성
 * @date 		: 2021. 4. 2.
 */
public interface Item {
	
	public String name();
	public Packing packing();
	public float price();
}
