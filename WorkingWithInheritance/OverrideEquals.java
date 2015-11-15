class Item {
  Integer size;
  Item(Integer size) {
    this.size = size;
  }
  private Item() {
    size = 1;
  }
  // overloading equals(Object o) method
  public boolean equals(Item item2) {
    if (this == item2) return true;
    return this.size.equals(item2.size);
  }
}

class Sword extends Item {
  public Sword() {
    //! super(); // private constructor cannot be called
    super(5);
  }
}

class SkepticRide {
  public static void main(String[] args) {
    Item itemA = new Item(10);
    Item itemB = new Item(10);
    Object itemC = itemA;
    // overloaded method defined by reference type
    System.out.println("|" + itemA.equals(itemB) +
                       "|" + itemC.equals(itemB) + "|");
    // prints |true|false|
  }
}

