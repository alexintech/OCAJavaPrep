public class KoalaTester {
  public static void main(String[] args) {
    Koala.main(new String[0]);

    Koala k = new Koala();
    System.out.println(k.count);
    k = null;
    Koala ka;
    System.out.println(k.count);   // OK, k is a Koala
    //! System.out.println(ka.count);  // error: ka is not initialized
  }
}
