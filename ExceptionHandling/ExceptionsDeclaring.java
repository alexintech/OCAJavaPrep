class NoMoreCarrotsException extends Exception { }

class Animal {
  public void eat() throws Exception { }
}

class Rabbit extends Animal {
  public void eat() throws Exception, NoMoreCarrotsException {
    throw new Exception("no more carrots");
  }
}

public class ExceptionsDeclaring {
  private static void eatCarrot() { }

  public void bad() {
    try {
      eatCarrot();
    // } catch (NoMoreCarrotsException e) {
    //   // error: exception NoMoreCarrotsException is never thrown
    //   // in body of corresponding try statement
    //   System.out.println("sad rabbit");
    // }
    } catch (Exception e) { // OK, because it may handle RuntimeException
      System.out.println("OK");
    }
  }

  public static void main(String[] args) {
    Animal animal = new Rabbit();
    try {
      animal.eat();
    } catch (NoMoreCarrotsException e) {
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println(e);
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}

