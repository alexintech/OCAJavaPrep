import java.io.*;

public class MostSpecificCall {
  public void method(Object o) {
    System.out.println("Object Version");
  }
  public void method(FileNotFoundException o) {
    System.out.println("FileNotFoundException Version");
  }
  public void method(IOException o) {
    System.out.println("IOException Version");
  }
  public void methodFail(Object o) {
    System.out.println("Object Version");
  }
  public void methodFail(String o) {
    System.out.println("String Version");
  }
  public void methodFail(StringBuilder o) {
    System.out.println("StringBuilder Version");
  }
  public static void main(String[] args) {
    MostSpecificCall msc = new MostSpecificCall();
    // Calls the most specific method
    msc.method(null);  // FileNotFoundException Version

    //! msc.methodFail(null); // reference to methodFail is ambiguous
  }
}

