public class InstanceInitializer {
  private String name = "Instance";
  
  { System.out.println(name); }
  public static void main(String[] args) {
    InstanceInitializer i = new InstanceInitializer();
  }
  
  { System.out.println("Second init"); }
}
