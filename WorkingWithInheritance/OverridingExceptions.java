class InsufficientDataException extends Exception { }

class Reptile {
  protected double getHeight() throws InsufficientDataException {
    return 2;
  }
  protected int getLength() {
    return 10;
  }
}

class Snake extends Reptile {
  // error: thrown exception is broader than in parent class
  protected double getHeight() throws Exception {
    return 2;
  }
  // error: new exception is thrown
  protected int getLength() throws InsufficientDataException {
    return 10;
  }
}
