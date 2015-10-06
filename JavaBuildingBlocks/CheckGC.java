import java.util.Date;
public class CheckGC {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    System.out.println("Total JVM memory: " + rt.totalMemory());
    System.out.println("Before memory: " + rt.freeMemory());
    Date d = null;
    for(int i = 0; i < 10000; i++) {
      d = new Date();
      d = null;
      rt.gc();  // an alternate to System.gc()
      System.out.println("After GC memory: " + rt.freeMemory());
    }
    System.out.println("After memory: " + rt.freeMemory());
  }
}
