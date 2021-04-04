package builderTutorial;

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
}
