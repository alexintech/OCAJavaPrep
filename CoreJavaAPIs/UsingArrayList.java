import java.util.*;

public class UsingArrayList {
  public static void main(String[] args) {
    // warning: Unchecked or unsafe operations
    ArrayList list = new ArrayList();
    list.add("hawk");
    list.add(Boolean.TRUE);
    list.add(12);
    System.out.println(list);

    ArrayList<String> safer = new ArrayList<>();
    safer.add("sparrow");
    //! safer.add(Boolean.TRUE);    // error: Boolean is not a String

    List<String> birds = new ArrayList<>();
    birds.add("hawk");
    birds.add(1, "robin");
    birds.add(0, "blue jay");
    birds.add(1, "cardinal");
    System.out.println(birds); // [blue jay, cardinal, hawk, robin]

    birds.add("hawk");
    System.out.println(birds.remove("blue")); // false
    System.out.println(birds.remove("hawk")); // true
    System.out.println(birds.remove(0)); // blue jay
    System.out.println(birds); // [cardinal, robin, hawk]

    System.out.println(birds.set(0, "robin")); // cardinal
    System.out.println(birds.size()); // 3
    // System.out.println(birds.set(9, "robin")); // throws IndexOutOfBoundsException

    System.out.println(birds.isEmpty()); // false
    System.out.println(birds.size()); // 3
    birds.clear();
    System.out.println(birds.isEmpty()); // true
    System.out.println(birds.size()); // 0

    birds.add("hawk");
    System.out.println(birds.contains("hawk")); // true
    System.out.println(birds.contains("robin")); // false

    List<String> one = new ArrayList<>();
    List<String> two = new ArrayList<>();
    System.out.println(one.equals(two)); // true
    one.add("a");
    System.out.println(one.equals(two)); // false
    two.add("a");
    System.out.println(one.equals(two)); // true
    one.add("b");
    two.add(0, "b");
    System.out.println(one.equals(two)); // false

    List<String> list1 = new ArrayList<>();
    list1.add("hawk");
    list1.add("robin");
    Object[] objectArray = list1.toArray();
    System.out.println(objectArray.length); // 2
    String[] stringArray = list1.toArray(new String[0]);
    System.out.println(stringArray.length); // 2

    String[] array = { "hawk", "robin" };
    List<String> list2 = Arrays.asList(array); // returns fixed size list
    System.out.println(list2.size()); // 2
    list2.set(1, "test");
    array[0] = "new";
    for (String b : array) System.out.print(b + " ");  // new test
    System.out.println();
    // list2.remove(1);    // throws UnsupportedOperationException

    List<String> nums = Arrays.asList("one", "two");

    List<Integer> numbers = new ArrayList<>();
    numbers.add(99);
    numbers.add(5);
    numbers.add(81);
    Collections.sort(numbers);
    System.out.println(numbers);

    ArrayList<String> myArrList = new ArrayList<String>();
    myArrList.add("One");
    myArrList.add("Two");

    ArrayList<String> yourArrList = new ArrayList<String>();
    yourArrList.add("Three");
    yourArrList.add("Four");

    myArrList.addAll(1, yourArrList);
    myArrList.forEach((val) -> System.out.println(val)); // using forEach()
  }
}

