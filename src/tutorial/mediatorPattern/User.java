package tutorial.mediatorPattern;

/**
 * 2. User클래스 생성
 * @date 		: 2021. 5. 27.
 */
public class User {
	
	private String name;
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
