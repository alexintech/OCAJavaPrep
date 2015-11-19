class RoomException extends Exception {} // Checked exception

class Motel {
  private int rooms = 250;

  {
    if (rooms > 100)
      throw new RoomException(); // can throw checked exception
                    // but must be declared in every constructor
  }

  public Motel() throws RoomException { }
  public Motel(int a) throws RoomException { }
}

public class ExceptionsInInstBlocks {
  public static void main(String[] args) {
    try { new Motel(); }
    catch ( RoomException e) {
      e.printStackTrace();
    }
  }
}

