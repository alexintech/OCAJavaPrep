class Pet {
  void makeNoise() {
    System.out.println("generic noise");
  }
}

class Dog extends Pet {
  void makeNoise() {
    System.out.println("bark");
  }
  void playDead() {
    System.out.println("roll over");
  }
}

class CastTest {
  public static void main(String[] args) {
    Pet[] a = {new Pet(), new Dog(), new Pet()};
    for(Pet pet : a) {
      pet.makeNoise();
      if(pet instanceof Dog) {
        //! pet.playDead(); // error: method not found
        Dog d = (Dog) pet;  // casting
        d.playDead();
        ((Dog)pet).playDead();  // the same casting
      }
    }

    Pet pet = new Pet();
    Dog d = (Dog) pet; // Exception java.lang.ClassCastException
    //! String s = (String) pet;  // error: incompatible types
  }
}
