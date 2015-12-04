class Camera {
  public static void main(String[] args) {
    String settings = null;
    if (false) {      // OK
      System.out.println("Camera:" + settings);
    }
    while (false) {     // unreachable statement
      settings = "Adjust settings manually";
    }
    for (; false ; ) {  // unreachable statement
    }
    System.out.println("Camera:" + settings);
  }
}

