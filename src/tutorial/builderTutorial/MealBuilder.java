package tutorial.builderTutorial;

/**
 * 6. Meal객체 생성을 담당하는 MealBuilder클래스 생성
 * VegMeal을 해당하는 VegBurger와 Coke를 Meal객체에 담아 반환
 * NonVegMeal에 해당하는 chickenBurger와 Pepsi를 Meal객체에 담아 반환
 * 
 * 만약에 다른 Meal조합이 있다면 여기서 추가하면될듯 VegBurger와 Pepsi같이..
 * @date 		: 2021. 4. 2.
 */
public class MealBuilder {
	
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	//객체생성할때 사용하는 Builder의 기본이 되는 느낌?
	//기본이지만 조금 다른느낌
	//이렇게 써도 되나?
	public Meal prepareMeal1() {
		Meal meal = new Meal();
		//Meal meal = new Meal().addItem(new ChickenBurger());	//이렇게는 안됨
		return meal;
	}
}
