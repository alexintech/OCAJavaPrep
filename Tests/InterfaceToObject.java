interface Roamable { }
class Phone { }

class Tablet extends Phone implements Roamable {
  Roamable var = (Roamable)new Phone();  // compile, but throw ClassCastException
  public static void main(String[] args) {
    Tablet tablet = new Tablet();
  }
}

