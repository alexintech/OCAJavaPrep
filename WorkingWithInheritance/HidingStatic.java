class Bear {
  public static void sneeze() {
    System.out.println("Bear is sneezing");
  }
  public void hibernate() {
    System.out.println("Bear is hibernating");
  }
}

class Panda extends Bear {
  // error: overriden method is static
  public void sneeze() {
    System.out.println("Panda bear sneezes quitly");
  }
  // error: overriding method is static
  public static void hibernate() {
    System.out.println("Panda bear is going to sleep");
  }
}

