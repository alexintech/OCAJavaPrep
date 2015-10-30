class Bird {
  { System.out.print("b1 "); }                  // 5
  public Bird() { System.out.print("b2 "); }    // 6
  static { System.out.print("b3 "); }           // 1
}

class Raptor extends Bird {
  static { System.out.print("r1 "); }           // 2
  public Raptor() { System.out.print("r2 "); }  // 8
  { System.out.print("r3 "); }                  // 7
  static { System.out.print("r4 "); }           // 3
}

class Hawk extends Raptor {
  public static void main(String[] args) {
    System.out.print("pre ");                   // 4
    new Hawk();
    System.out.print("hawk ");                  // 9
  }
}
