public class TestAnimals {
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal b = new Horse();
    a.eat();
    b.eat();
    Horse h = new Horse();
    h.jump();         // ok
    //! b.jump();     // error: unreported exception; must be caught
  }
}

class UseAnimals {
  public void doStuff(Animal a) {
    System.out.println("In the Animal version");
  }
  public void doStuff(Horse a) {
    System.out.println("In the Horse version");
  }
  public static void main(String[] args) {
    UseAnimals ua = new UseAnimals();
    Animal animalObj = new Animal();
    Horse horseObj = new Horse();
    ua.doStuff(animalObj);
    ua.doStuff(horseObj);

    Animal animalRefToHorse = new Horse();
    ua.doStuff(animalRefToHorse); // doStuff(Animal) version
  }
}

class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
  public static void doStuff() { }

  public void jump() throws Exception { }
}

class Horse extends Animal {
  /* error: attempting to assign weaker access privileges; was public
  private void eat() {
    System.out.println("Horse eating hay, oats, "
                        + "and horse treats");
  }
  */

  // legal overriding
  public void eat() {
    System.out.println("Horse eating hay, oats, "
                        + "and horse treats");
  }

  /* error: overridden method does not throw IOException
  public void eat() throws IOException { }
  */

  /* error: return type String is not compatible with void
  public String eat() { return "Horse"; }
  */

  // static methods are not overriden
  public static void doStuff() {
    //! super.doStuff();  // error: non-static variable super
                          // cannot be referenced from a static context
  }

  // that's legal
  public void jump() { /* no Exceptions */ }
}
