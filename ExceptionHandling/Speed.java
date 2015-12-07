public class Speed {
  public static void main(String[] args) {
    Speed objRef = new Speed();
    // double speed = objRef.calSpeed(-12.0, 3.0);
    // double speed = objRef.calSpeed(12.0, -3.0);
    // double speed = objRef.calSpeed(12.0, 2.0);
    double speed = objRef.calSpeed(12.0, 0.0);
    System.out.println("Speed (km/h): " + speed);
  }

  /** Requires distance >= 0.0 and time > 0.0 */
  private double calSpeed(double distance, double time) {
    assert distance >= 0.0;
    assert time > 0.0 : "Time is not a positive value: " + time;
    double speed = distance / time;
    assert speed >= 0.0;
    return speed;
  }
}

