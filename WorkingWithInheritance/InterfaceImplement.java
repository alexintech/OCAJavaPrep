interface Herbivore {
  public int eatPlants();
  int VAR = 10;
}

interface Omnivore {
  public void eatPlants();
}

// error: types Omnivore and Herbivore are incompatible;
// both define eatPlants(), but with unrelated return types
//! interface Supervore extends Herbivore, Omnivore { }

//! abstract class AbstractBear implements Herbivore, Omnivore { }

abstract class AbstractBear implements Herbivore {
  public static final int VAR = 15; // hiding interface variable

  public static void main(String[] args) {
    System.out.println(VAR);
    System.out.println(Herbivore.VAR);
  }
}
