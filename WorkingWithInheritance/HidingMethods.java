abstract class Bird {
  private void fly() {
    System.out.println("Bird is flying");
  }
  public void voice() {
    System.out.println("Bird's voice");
  }

  public static void main(String[] args) {
    Bird bird = new Pelican();
    bird.fly(); // overriding is not used, so the method
                // is defined by reference type
                // Bird's private fly() will be invoked
    bird.voice();
  }
}

class Pelican extends Bird {
  // private method is not overriden, it's hidden
  //! @Override     // method doen't override or implement method form a supertype
  protected void fly() {
    System.out.println("Pelican is flying");
  }

  @Override     // guarantees that the method is overriden
  public void voice() {
    super.voice();
    String str = ((Object)this).toString();
    System.out.println(str);
    System.out.println(super.getClass());
    //! str = ((Object)super).toString(); // You can't cast super
    System.out.println("Pelican's voice");
  }
}
