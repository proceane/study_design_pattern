package tutorial.filterTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Criteria인터페이스를 구현하는 클래스 생성
 * Person이 싱글이면 리스트에 추가
 * @date 		: 2021. 5. 21.
 */
public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
