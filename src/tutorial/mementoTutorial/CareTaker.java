package tutorial.mementoTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. memento를 담을 careTaker클래스 생성
 * @date 		: 2021. 5. 27.
 */
public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento state) {
		mementoList.add(state);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
