package tutorial.compositeTutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Employee가 담긴 리스트를 가지는 Employee객체 생성
 * @date 		: 2021. 5. 23.
 */
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinate;
	
	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinate = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		subordinate.add(e);
	}
	
	public void remove(Employee e) {
		subordinate.remove(e);
	}
	
	public List<Employee> getSubordinate(){
		return subordinate;
	}
	
	public String toString() {
		return ("Employee : [ Name : " + name + ", dept : " + dept + ", salary : " + salary + " ]");
	}
}
