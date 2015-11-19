interface Flyer { }
class Bat { }
final class Eagle { }

public class InstanceOfInterface {
  public static void main(String[] args) {
    Bat bat = new Bat();
    Eagle eagle = new Eagle();
    if (bat instanceof Flyer) System.out.println("bat is a Flyer"); // OK
        // because Bat can be extended with implementation of Flyer
    //! if (eagle instanceof Flyer) System.out.println("eagle is a Flyer"); // error:
        // compiler knows that final class can't be extended
  }
}

