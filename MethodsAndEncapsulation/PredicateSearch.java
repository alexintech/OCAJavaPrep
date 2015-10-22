import java.util.*;
import java.util.function.*;

public class PredicateSearch {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("fish", false, true));
    animals.add(new Animal("kangaroo", true, false));
    animals.add(new Animal("rabbit", true, false));
    animals.add(new Animal("turtle", false, true));

    print(animals, a -> a.canHop());
    print(animals, a -> a.canSwim());
    print(animals, a -> ! a.canSwim());

    List<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies);
    bunnies.removeIf(s -> s.charAt(0) != 'h');
    System.out.println(bunnies);
  }
  private static void print(List<Animal> animals, Predicate<Animal> checker) {
    for (Animal animal : animals) {
      if (checker.test(animal))
        System.out.print(animal + " ");
    }
    System.out.println();
  }
}
