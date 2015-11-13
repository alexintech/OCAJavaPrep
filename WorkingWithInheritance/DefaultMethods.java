interface Walk {
  public default int getSpeed() {
    return 5;
  }
}

interface Run {
  public default int getSpeed() {
    return 10;
  }
}

// error: class Cat inherits unrelated defaults for getSpeed()
// from types Walk and Run
// class Cat implements Walk, Run {
//   public static void main(String[] args) {
//     System.out.println(new Cat().getSpeed());
//   }
// }

class TrueCat implements Walk, Run {
  // You must provide an implementation
  public int getSpeed() {
    return 1;
  }

  public static void main(String[] args) {
    System.out.println(new TrueCat().getSpeed());
  }
}

// You must provide default method or abstract
//! interface WalkRun extends Walk, Run { }
//! abstract class AbstractCat implements Walk, Run { }
