public class Mutable {
  private StringBuilder builder;

  public Mutable(StringBuilder b) {
    builder = new StringBuilder(b);
  }

  public StringBuilder getBuilder() {
    return new StringBuilder(builder);
  }
}

class MutableTest {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("initial");
    Mutable mute = new Mutable(sb);
    sb.append(" added");
    StringBuilder gotBuilder = mute.getBuilder();
    gotBuilder.append(" more");
    System.out.println(mute.getBuilder());
  }
}
