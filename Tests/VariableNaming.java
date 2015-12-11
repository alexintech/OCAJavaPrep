import java.util.*;

public class VariableNaming {
  public static void main(String[] args) {
    String String = "string isa string";  // variable String is legal
    System.out.println(String.substring(3, 6));

    String Arrays = "string isa string";  // variable Arrays is legal
    java.util.Arrays.sort(new int[]{1, 4, 3});  // OK
    //! Arrays.sort(new int[]{1, 4, 3});      // error: Array is of String type
  }
}

