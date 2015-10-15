public class Sunlight {
  public static void main(String[] args) {
    int kmFromSun = 150000000;

    int lightSpeed = 299792458; // meters per second

    long mFromSun = kmFromSun * 1000L;
    int seconds = (int) (mFromSun / lightSpeed);

    System.out.print("Light will use ");
    printTime(seconds);
    System.out.println(" to travel from the sun to the earth.");
  }

  public static void printTime(int sec) {
    int min = sec / 60;
    sec = sec - (min * 60);
    System.out.println(min + " minute(s) and " + sec + " second(s)");
  }
}
