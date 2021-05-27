package tutorial.filterTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Criteria사용
 * @date 		: 2021. 5. 21.
 */
public class CriteriaPatternDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		//필터링할 객체들을 리스트에 추가
		persons.add(new Person("Robert","Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		//필터링할 기준 생성
		Criteria male = new CriteriaMale();		//남성
		Criteria female = new CriteriaFemale();	//여성
		Criteria single = new CriteriaSingle();	//싱글
		Criteria singleMale = new AndCriteria(single, male);	//싱글이면서 남성
		Criteria singleOrFemale = new OrCriteria(single, female);	//싱글이거나 여성
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSingle And Males: ");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
		
	}
	
	static void printPersons(List<Person> persons) {
		for(Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

}
