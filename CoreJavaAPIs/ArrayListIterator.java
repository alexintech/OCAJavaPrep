import java.util.*;

public class ArrayListIterator {
  public static void main(String[] args) {
    ArrayList<String> myArrList = new ArrayList<String>();
    myArrList.add("One");
    myArrList.add("Two");
    myArrList.add("Four");
    myArrList.add(2, "Three");
    ListIterator<String> iterator = myArrList.listIterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for(String s : myArrList) {
      if (s.equals("Two")) {
        myArrList.remove("Two"); // throws ConcurrentModificationException
      }
    }
  }
}

