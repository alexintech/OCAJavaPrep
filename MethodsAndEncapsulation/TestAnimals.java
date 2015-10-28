public class TestAnimals {
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal b = new Horse();
    a.eat();
    b.eat();
  }
}

class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
}

class Horse extends Animal {
  // error: attempting to assign weaker access privileges; was public
  private void eat() {
    System.out.println("Horse eating hay, oats, "
                        + "and horse treats");
  }
}
