public class LocalVariables {
  public void findAnswer(boolean check) { 
    int answer;
    int onlyOneBranch;
    if (check) {
      onlyOneBranch = 1;
      answer = 1; 
    } else {
      answer = 2; 
    }
    System.out.println(answer);
    //! System.out.println(onlyOneBranch); // DOES NOT COMPILE 

    double price;
    if (true)           // Compiler know it's always true
      price = 100.0;
    System.out.println(price);  // But this is OK
  }
}
