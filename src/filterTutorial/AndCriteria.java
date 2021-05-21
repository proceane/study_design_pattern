package filterTutorial;

import java.util.List;

/**
 * 3. Criteria인터페이스를 구현하는 클래스 생성
 * 조건 2개를 만족하면 두 조건의 리스트를 합친 리스트를 반환
 * 예를 들면 criteria가 남성, otherCriteria가 싱글인 기준을 만족하는 리스트를 만들어야할때 사용
 * @date 		: 2021. 5. 21.
 */
public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
