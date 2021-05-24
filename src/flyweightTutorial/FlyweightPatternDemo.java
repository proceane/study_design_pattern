package flyweightTutorial;

/**
 * 4. 메인메소드 생성
 * @date 		: 2021. 5. 24.
 */
public class FlyweightPatternDemo {
	
	private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
		
		//해당 컬러 circle객체가 없으면 생성하고 있으면 있는거를 가져오고
		//있는 circle객체긴한데 color만 지정된 객체라서 x, y, radius값을 따로 지정해줘야하는건가
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
	
	private static int getRandomX() {
		return (int)(Math.random() * 100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random() * 100);
	}
}
