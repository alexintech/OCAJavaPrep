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

class Overrides {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat(); // Generic Animal Eating Generically

    Horse h = new Horse();
    h.eat(); // Horse eating hay

    Animal ah = new Horse();
    ah.eat(); // Horse eating hay

    Horse he = new Horse();
    he.eat("Apples"); // Horse eating hay

    Animal a2 = new Animal();
    //! a2.eat("treats");   // compiler error!

    Animal ah2 = new Horse();
    //! ah2.eat("Carrots");   // compiler error!
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
  // legal overriding
  public void eat() {
    System.out.println("Horse eating hay");
  }

  // legal overloading
  public void eat(String s) {
    System.out.println("Horse eating " + s);
  }

  // that's legal
  public void jump() { /* no Exceptions */ }

  /* error: attempting to assign weaker access privileges; was public
  private void eat() {
    System.out.println("Horse eating hay, oats, "
                        + "and horse treats");
  }
  */

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
}
