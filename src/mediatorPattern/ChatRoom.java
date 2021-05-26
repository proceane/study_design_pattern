package mediatorPattern;

import java.util.Date;

/**
 * 1. mediator가 될 클래스 생성
 * @date 		: 2021. 5. 27.
 */
public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
