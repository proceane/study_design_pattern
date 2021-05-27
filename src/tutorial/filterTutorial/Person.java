package tutorial.filterTutorial;

/**
 * 1. filter(기준)를 적용할 클래스 생성
 * @date 		: 2021. 5. 21.
 */
public class Person {
	
	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person(String name, String gender, String maritalStatus) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

}
