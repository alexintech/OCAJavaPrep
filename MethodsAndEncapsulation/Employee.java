class Employee {
  String name;
  int age;
  Employee() {
    //! this(); // error: recursive constructor invocation
  }
  Employee(String newName, int newAge) {
    name = newName;
    age = newAge;
  }
}
