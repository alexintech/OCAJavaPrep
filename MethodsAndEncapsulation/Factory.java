import mypkg.State;

import static mypkg.State.*;   // Static import on demand
import static java.lang.System.out;

public class Factory {
  public static void main(String[] args) {
    State[] states = { IDLE, BUSY, IDLE, BLOCKED };
    for(State s : states)
      out.print(s + " ");
  }
}

