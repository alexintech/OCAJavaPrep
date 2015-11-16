abstract class MyClass implements Interface1, Interface2 {
  public void f() { }
  public void g() {
    //! System.out.println(VAL_B); // reference to VAL_B is ambigious
    System.out.println(Interface1.VAL_B);
  }
}

interface Interface1 {
  int VAL_A = 1;
  int VAL_B = 2;

  void f();
  void g();
}

interface Interface2 {
  int VAL_B = 3;
  int VAL_C = 4;

  void g();
  void h();
}
