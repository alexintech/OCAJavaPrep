abstract class Bird {
  private void fly() {
    System.out.println("Bird is flying");
  }

  public static void main(String[] args) {
    Bird bird = new Pelican();
    bird.fly(); // overriding is not used, so the method
                // is defined by reference type
                // Bird's private fly() will be invoked
  }
}

class Pelican extends Bird {
  // private method is not overriden, it's hidden
  protected void fly() {
    System.out.println("Pelican is flying");
  }
}
