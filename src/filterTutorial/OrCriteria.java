package filterTutorial;

import java.util.List;

/**
 * 3. Criteria인터페이스를 구현하는 클래스 생성
 * 조건이 하나라도 만족하면 리스트에 추가
 * @date 		: 2021. 5. 21.
 */
public class OrCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = criteria.meetCriteria(persons);
		
		for(Person person : otherCriteriaItems) {
			if(!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
