class Mammal {
  String name = "furry ";
  String makeNoise() { return "generic noise"; }
}
class Zebra extends Mammal {
  String name = "stripes ";     // legal redefining instance variable
  String makeNoise() { return super.name + "bray"; } // use base instance var
}
public class ZooKeeper {
  public static void main(String[] args) {
    new ZooKeeper().go();
  }
  void go() {
    Mammal m = new Zebra();
    System.out.println(m.name + m.makeNoise()); // furry furry bray
    // Polymorphism is only for instance methods, not instance variables
  }
}
