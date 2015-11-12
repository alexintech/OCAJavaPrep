interface Herbivore {
  public int eatPlants();
}

interface Omnivore {
  public void eatPlants();
}

// error: types Omnivore and Herbivore are incompatible;
// both define eatPlants(), but with unrelated return types
//! interface Supervore extends Herbivore, Omnivore { }

//! abstract class AbstractBear implements Herbivore, Omnivore { }
