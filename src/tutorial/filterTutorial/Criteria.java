package tutorial.filterTutorial;

import java.util.List;

/**
 * 2. Criteria(기준)에 대한 인터페이스를 생성
 * @date 		: 2021. 5. 21.
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
