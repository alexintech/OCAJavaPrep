import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ShadowingByImporting {
  public static void main(String[] args) throws FileNotFoundException {
    out.println("Calling println() in java.lang.System.out");
    PrintWriter pw = new PrintWriter("log.txt");
    writeInfo(pw);
    pw.flush();
    pw.close();
  }

  public static void writeInfo(PrintWriter out) { // Shadows java.lang.System.out
    out.println("Calling println() in the parameter out");
    System.out.println("Calling println() in java.lang.System.out");
  }
}
