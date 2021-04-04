package builderTutorial;

/**
 * 1. 상품 인터페이스 생성
 * 상품은 상품명, 포장방식, 가격으로 이루어짐
 * @date 		: 2021. 4. 2.
 */
public interface Item {
	
	public String name();
	public Packing packing();
	public float price();
}
