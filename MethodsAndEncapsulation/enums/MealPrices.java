public class MealPrices {
  public static void main(String[] args) {
    System.out.printf(
        "Please note that %s, %02d:%02d, on %s costs $%.2f.%n",
        Meal.BREAKFAST.name(),
        Meal.BREAKFAST.getHour(), Meal.BREAKFAST.getMins(),
        Day.MONDAY,
        Meal.BREAKFAST.mealPrice(Day.MONDAY)
    );

    System.out.println("Meal prices on " + Day.SATURDAY + " are as follows:");
    Meal[] meals = Meal.values();
    for (Meal meal : meals)
      System.out.printf(
          "%s costs $%.2f.%n", meal, meal.mealPrice(Day.SATURDAY)
      );
  }
}
