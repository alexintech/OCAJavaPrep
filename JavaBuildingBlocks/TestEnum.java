enum Animals {
  DOG("woof"), CAT("meow"), FISH("burble");
  String sound;
  Animals(String s) { sound = s; }
}
class TestEnum {
  static Animals a; // You can use static variable to access enum values
  public static void main(String[] args) {
    System.out.println(a.DOG.sound + " " + a.FISH.sound);
  }
}
