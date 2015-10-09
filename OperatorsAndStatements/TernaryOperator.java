public class TernaryOperator {
  public static void main(String[] args) {
    int y = 10;
    System.out.println((y > 5) ? 21 : "Hourse");
    //! int animal = (y < 91) ? 9 : "Horse"; // error: String cannot be converted to int
    
    int a = 1;
    int b = 1;
    int z = a < 10 ? a++ : b++;
    System.out.println(a + ", " + b); // outputs 2, 1
  }
}
