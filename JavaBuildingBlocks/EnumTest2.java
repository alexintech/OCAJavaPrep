class Coffee2 {
  enum CoffeeSize { BIG, HUGE, OVERWHELMING }
  CoffeeSize size;
}

public class EnumTest2 {
  public static void main(String[] args) {
    //! enum CoffeeSize { BIG, HUGE }; // Cannot declare enums in methods

    Coffee2 drink = new Coffee2();
    drink.size = Coffee2.CoffeeSize.BIG;
    System.out.println(drink.size);
  }
}
