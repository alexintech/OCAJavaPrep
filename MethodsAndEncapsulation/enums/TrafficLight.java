public enum TrafficLight {
  RED("Stop"), YELLOW("Caution"), GREEN("Go");

  private String action;

  TrafficLight(String action) {
    //! super();  // is not allowed
    this(); // is legal
    this.action = action;
  }
  TrafficLight() {
    System.out.print(1);
  }

  public static void main(String[] args) {
    //  error: enum types may not be instantiated
    //! TrafficLight green = new TrafficLight("Go");
  }
}
