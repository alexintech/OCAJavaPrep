public class ForContinue {
  public static void main(String[] args) {
    for(char x = 'a'; x <= 'c'; x++) {
      if(x == 'b') 
        continue;
      System.out.print(x + " ");
    }
  }
}
