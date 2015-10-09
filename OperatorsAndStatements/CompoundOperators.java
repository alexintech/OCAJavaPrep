public class CompoundOperators {
  public static void main(String[] args) {
    long x = 10;
    int y = 5;
    //! y = y * x; // error: value must be casted to int
    y *= x; // compound operators do casting themselves
  }
}
