package prototypeTutorial;

/**
 * 1. Cloneable interface를 상속한 Shape 추상클래스 생성
 * Shape의 id와 type, id에 대한 getter/setter
 * clone을 반환하는 clone메소드 생성
 * @date 		: 2021. 4. 26.
 */
public abstract class Shape implements Cloneable {
	
	private String id;
	protected String type;
	
	abstract void draw();
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
