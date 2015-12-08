import java.util.*;

public class SubListTest {
  public static void main(String[] args) {
    List<String> s1 = new ArrayList<>();
    s1.add("a");
    s1.add("b");
    s1.add(1, "c");
    s1.add("d");
    s1.add("f");
    List<String> s2 = new ArrayList<>(s1.subList(1, 1)); // empty list
    s1.addAll(s2);
    System.out.println(s1);     // [ a, c, b, d, f ]

    s1.subList(1, 3).clear();   // remove to elements in s1 list
    System.out.println(s1);     // [ a, d, f ]

    s1.subList(0, 1).add("abc");  // adds an element to s1 list too
    System.out.println(s1);     // [ a, abc, d, f ]
  }
}

