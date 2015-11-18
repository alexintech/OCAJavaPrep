class NonStaticInitializers {
  int length = 10;
  // double area = length * width;   // error: illegal forward reference
  double area = length * this.width; // Ok, but width has default value 0
  int width = 10;

  int sqSide = height = 20;   // OK. Legal forward reference
  int height;
}

class Hotel {
  private int noOfRooms = 12;
  private int maxNoOfGuests = initMaxGuests(); // initialized with 0
  private int occupancyPerRoom = 2;

  public int initMaxGuests() {
    System.out.println("occupancyPerRoom: " + occupancyPerRoom);
    System.out.println("maxNoOfGuests: " + noOfRooms * occupancyPerRoom);
    return noOfRooms * occupancyPerRoom;
  }

  public int getMaxGuests() { return maxNoOfGuests; }

  public int getOccupancy() { return occupancyPerRoom; }
}

class TestOrder {
  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    System.out.println("After object creation: ");
    System.out.println("occupancyPerRoom: " + hotel.getOccupancy());
    System.out.println("maxNoOfGuests: " + hotel.getMaxGuests());
  }
}
