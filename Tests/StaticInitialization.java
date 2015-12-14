class Super {
  static String ID = "QBANK";
  static void printStr() {
    System.out.println(Sub.str);
  }
}

class Sub extends Super {
  public static final String str = "Bank"; // using constant variable does not
                                           // cause initialization process
  static {
    System.out.println("In Sub");  // isn't printed
  }
}

public class StaticInitialization {
  public static void main(String[] args) {
    System.out.println(Sub.ID);  // prints only QBANK
    System.out.println(Sub.str);  // prints only Bank
    Sub.printStr();  // won't cause initialization of Sub class
  }
}

