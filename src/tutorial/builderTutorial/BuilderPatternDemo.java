package tutorial.builderTutorial;

/**
 * 7. MealBuilder를 사용하는 메인클래스 생성
 * MealBuilder에서 원하는 Meal을 선택해서 가져옴
 * 리스트와 가격을 출력  
 * @date 		: 2021. 4. 2.
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost : " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Count : " + nonVegMeal.getCost());
		
	}

}
