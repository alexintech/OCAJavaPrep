public class Switcher {
  public static void main(String[] args) {
    int i = 1;
    switch(i) {
      case 0:
        boolean b = ++i > 5;  // initialization is not performed
        break;
      case 1:
        b = true;   // OK, b is declared in switch block
        System.out.println(b);
        break;
    }
    System.out.println(i);

  }
}

