class NumberSystems {
  public static void main(String args[]) {
    int baseDecimal = 267;
    int octVal = 0413;
    int hexVal = 0x10B;
    int binVal = 0b100001011;
    System.out.println (baseDecimal + octVal);
    System.out.println (hexVal + binVal);

    long var1 = 0_100_267_760;
    //! long var2 = 0_x_4_13;       // error: wrong position _ between 0x
    //! long var3 = 0b_x10_BA_75;   // error: wrong digits in binary literal
    //! long var4 = 0b_10000_10_11; // error: wrong position _ after 0b
    //! long var5 = 0xa10_AG_75;    // error: wrong letter G in hex literal
    long var6 = 0x1_0000_10;
    long var7 = 100__12_12;         // you can use two underscores
    //! long var8 = 100_L;          // error: wrong position _ before L suffix

    // throws exception NumberFormatException for input string "45_15"
    int a = Integer.parseInt("45_15"); 
  }
}
