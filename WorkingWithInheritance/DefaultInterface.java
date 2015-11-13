interface Carnivore {
  public default void eatMeat(); // error: missing method body

  // error: interface abstract methods can't have body
  public int getRequiredFoodAmount() {
    return 13;
  }
}

interface HasFins {
  public default int getNumberOfFins() {
    return 4;
  }
  public default double getLongestFinLength() {
    return 20.0;
  }
  public default boolean doFinsHaveScales() {
    return true;
  }
}

interface SharkFamily extends HasFins {
  // overrides the default method
  public default int getNumberOfFins() {
    return 8;
  }

  // replaces the default method with a new abstract method,
  // forcing any class that implements SharkFamily to provide
  // an implementation of the method.
  public double getLongestFinLength();

  // error: the method must be marked as default
  public boolean doFinsHaveScales() {
    return false;
  }
}
