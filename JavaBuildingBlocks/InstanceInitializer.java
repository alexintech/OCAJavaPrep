public class InstanceInitializer {
  { System.out.println(name); }
  private String name = "Instance";

  public static void main(String[] args) {
    InstanceInitializer i = new InstanceInitializer();
  }
}
