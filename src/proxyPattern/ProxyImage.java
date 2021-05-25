package proxyPattern;

/**
 * 2. Image인터페이스 구현
 * @date 		: 2021. 5. 25.
 */
public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
