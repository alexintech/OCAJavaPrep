public class LogicalOperators {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    System.out.println(a > 90 && ++b < 30);
    System.out.println("b: " + b); // b = 20
    System.out.println(a++ >= 99 || a <= 33 && b > 10);
    System.out.println("a: " + a); // a = 11

    a = 10;
    b = 20;
    boolean res = (a++ <= 99 || (a <= 33 && ++b > 10));
    System.out.println(res);
    System.out.println("a: " + a); // a = 11
    System.out.println("b: " + b); // b = 20
    
    boolean eq = a++ == a++;
    System.out.println("a++ == a++ is " + eq);
    eq = ++a == ++a;
    System.out.println("++a == ++a is " + eq);
    eq = ++a == a++;
    System.out.println("++a == a++ is " + eq);
    eq = a++ == ++a;
    System.out.println("a++ == ++a is " + eq);
  }
}
