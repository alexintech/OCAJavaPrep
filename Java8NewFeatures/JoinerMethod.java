public class JoinerMethod {
  public static void main(String[] args) {
    String names = String.join(", ", "Alex", "David", "Paul");
    System.out.println(names);

    String[] states = {"California", "Oregon", "Washington"};
    String statesList = String.join(", ", states);
    System.out.println(statesList);
  }
}

