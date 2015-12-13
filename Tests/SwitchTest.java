public class SwitchTest {
  public static void main(String[] args) {
    byte x = 5;
    switch(x) {
      case 'b':  // OK
      default:
      case -2:
      case 80:
    }

    byte a = 'x';  // char is assignable to byte!
    Byte b = 1;
  }
}

