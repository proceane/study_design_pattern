package mementoTutorial;

/**
 * 4. 메인 메소드 생성
 * @date 		: 2021. 5. 27.
 */
public class MementoPatternDemo {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");	//첫번째 상태는 careTaker에 저장이 안됨
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #4");
		System.out.println("Current State : " + originator.getState());
		
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State : " + originator.getState());
		
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State : " + originator.getState());
		
		//memento 패턴은 상태를 저장해서 저장한 상태들을 가져올수 있게 하는 패턴임
	}

}
