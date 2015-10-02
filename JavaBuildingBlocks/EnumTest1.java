enum CoffeeSize { BIG, HUGE, OVERWHELMING }

class Coffee {
  CoffeeSize size;
}

public class EnumTest1 {
  public static void main(String[] args) {
    Coffee drink = new Coffee();
    drink.size = CoffeeSize.BIG;
    System.out.println(drink.size);
  }
}
