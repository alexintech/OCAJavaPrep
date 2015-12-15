public class Convertion {
  public static void main(String[] args) {
    int i = 1234567890;
    float f = i;  // information was lost
    System.out.println(i - (int)f);  // -46
    System.out.println(f);
  }
}

