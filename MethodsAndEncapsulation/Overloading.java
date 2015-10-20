public class Overloading {
  public void fly(int a, Integer b) {
    System.out.println("int, Integer");
  }

  public void fly(Integer a, int b) {
    System.out.println("Integer, int");
  }

  public static void main(String[] args) {
    Overloading over = new Overloading();
    over.fly(3, new Integer(5));
    //! over.fly(3, 5); // error: reference to fly() is ambiguous
    //! over.fly(new Integer(3), new Integer(5)); // error: reference to fly() is ambiguous
  }
}

