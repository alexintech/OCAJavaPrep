class A {
  public int i = 10;
  private int j = 20;
}

class B extends A {
  private int i = 30;  // shadows i variable in A
  public int k = 40;
}

class C extends B { }   // doesn't have access to i variable

public class ShadowingVariables {
  public static void main(String[] args) {
    C c = new C();
    //! System.out.println(c.i);  // i has private access in B
    //! System.out.println(c.j);  // j has private access in A
    System.out.println(c.k);
  }
}

