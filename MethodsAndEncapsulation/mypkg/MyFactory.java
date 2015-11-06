package mypkg;
import static mypkg.IMachineState.*;   // Static import interface constants

public class MyFactory {
  public static void main(String[] args) {
    int[] states = { IDLE, BUSY, IDLE, BLOCKED };
    for(int s : states)
      System.out.print(s + " ");
  }
}
