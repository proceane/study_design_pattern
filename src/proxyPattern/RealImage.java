package proxyPattern;

/**
 * 2. Image인터페이스 구현
 * @date 		: 2021. 5. 25.
 */
public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying : " + fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading : " + fileName);
	}

}
