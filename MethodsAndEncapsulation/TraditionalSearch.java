import java.util.*;

class Animal {
  private String species;
  private boolean canHop;
  private boolean canSwim;
  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }
  public boolean canHop() { return canHop; }
  public boolean canSwim() { return canSwim; }
  public String toString() { return species; }
}

interface CheckTrait {
  boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
  public boolean test(Animal a) {
    return a.canHop();
  }
}

public class TraditionalSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    print(animals, new CheckIfHopper());
    print(animals, a -> a.canHop());
    print(animals, a -> a.canSwim());
    print(animals, a -> ! a.canSwim());
  }
  private static void print(List<Animal> animals, CheckTrait checker) {
    for (Animal animal : animals) {
      if (checker.test(animal))
        System.out.print(animal + " ");
    }
    System.out.println();
  }
}
