interface Hop {
  static int getJumpHeight() {
    return 8;
  }
}

interface Ale extends Hop { }

class Bunny implements Hop {
  public static void main(String[] args) {
    //! System.out.println(getJumpHeight()); // error: static interface methods
                                          // are not inherited
    System.out.println(Hop.getJumpHeight());

    // error: static method is not inherited
    //! System.out.println(Ale.getJumpHeight());
  }
}

