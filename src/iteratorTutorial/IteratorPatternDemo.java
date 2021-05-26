package iteratorTutorial;

/**
 * 3. 메인 메소드 생성
 * @date 		: 2021. 5. 26.
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		
		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
		
		//순회하는 로직 만들때 사용하는듯
		//이미 자바에는 iterator가 구현되어있는데 그게 어떤 패턴으로 되어있는지 알려주는느낌
	}

}
