public class StringBuilderMethods {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder().append(1).append('c');
    sb.append("-").append(true);
    //! sb.append(null); // reference to append is ambiguous
    System.out.println(sb);   // 1c-true

    sb = new StringBuilder("animals");
    sb.insert(7, "-");    // sb = animals-
    sb.insert(0, "-");    // sb = -animals-
    sb.insert(4, "-");    // sb = -ani-mals-
    System.out.println(sb);

    sb = new StringBuilder("abcdef");
    sb.delete(1, 3);      // sb = adef
    // sb.deleteCharAt(5);   // throws StringIndexOutOfBoundsException
    System.out.println(sb);

    sb = new StringBuilder("ABC");
    sb.reverse();
    System.out.println(sb);
  }
}

