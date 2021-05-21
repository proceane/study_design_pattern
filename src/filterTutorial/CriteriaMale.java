package filterTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Criteria인터페이스를 구현하는 클래스 생성
 * Person의 성별이 남자면 리스트에 추가
 * @date 		: 2021. 5. 21.
 */
public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
