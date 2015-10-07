public class CharStackTest {
  public static void main(String[] args) {
    PrintableCharStack stack = new PrintableCharStack(40);
    String str = "Hello, Java!";
    System.out.println("Original string: " + str);

    for(int i = 0; i < str.length(); i++)
      stack.push(str.charAt(i));

    System.out.print("Reversed string: ");
    stack.printStack();
  }
}
