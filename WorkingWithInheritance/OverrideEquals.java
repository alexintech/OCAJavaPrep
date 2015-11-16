class Item implements Something {
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

interface Something { }

// error: default method toString in interface Something
// overrides a member of java.lang.Object
// interface LikeObject {
//   public default String toString() {
//     return "Something";
//   }
// }

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

    Something s = itemA;
    // You can use Object's methods over interface type reference
    System.out.println(s.toString());
    System.out.println(s.equals(itemB));
  }
}

