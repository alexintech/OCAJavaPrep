class A { }
class B extends A {
  public static void main(String[] args) {
    A myA = new B();
    m2(myA);

    String a = null;
    boolean b = null instanceof String;
    boolean c = a instanceof String;
    System.out.println(b + " " + c);
  }
  public static void m2(A a) {
    if (a instanceof B)
      ((B)a).doBstuff();    // downcasting an A reference
                            // to a B reference
  }
  public static void doBstuff() {
    System.out.println("'a' refers to a B");
  }
}

class Cat { }
class Dog {
  public static void main(String[] args) {
    Dog d = new Dog();
    //! System.out.println(d instanceof Cat); // error: incompatible types
  }
}
