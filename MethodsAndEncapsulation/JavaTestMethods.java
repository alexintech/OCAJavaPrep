class Phone {
  double weight;
  void setWeight(double val) {
    weight = val;
  }
  double getWeight() {
    return weight;
  }
  void setHeight(double val) {
    return;
    //! weight = val; // error: unreachable statement
  }
  Phone() {
    weight = 1;
    return;     // return statement is allowed in constructors
  }
}

public class JavaTestMethods {
  public static void main(String args[]) {
    Phone p = new Phone();
    //! double newWeight = p.setWeight(20.0); // error: incompatible types:
                                   // void cannot be converted to double
  }
}
