class RoomOccupancyTooHighException
      extends RuntimeException {}     // Unchecked Exception
class TooManyHotelsException
      extends Exception {}            // Checked Exception

class Hotel1 {
  private static int noOfHotels = 12;
  private static Hotel1[] hotelPool = createHotelPool();

  private static Hotel1[] createHotelPool() {
    try {
      if (noOfHotels > 10)
        throw new TooManyHotelsException();
    } catch (TooManyHotelsException e) {
      noOfHotels = 10;
      System.out.println("No. of hotels adjusted to " + noOfHotels);
    }
    return new Hotel1[noOfHotels];
  }

  private int noOfRooms = 215;
  private int occupancyPerRoom = 5;
  private int maxNoOfGuests = initMaxGuests();

  private int initMaxGuests() {
    if (occupancyPerRoom > 4)
      throw new RoomOccupancyTooHighException();
    return noOfRooms * occupancyPerRoom;
  }
}

public class ExceptionsInInitializers {
  public static void main(String[] args) {
    try { new Hotel1(); }
    catch (RoomOccupancyTooHighException exception) {
      exception.printStackTrace();
    }
  }
}

