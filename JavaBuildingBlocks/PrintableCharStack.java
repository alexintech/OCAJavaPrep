public class PrintableCharStack extends CharStack {
  public PrintableCharStack(int capacity) {
    super(capacity);
  }

  public void printStack() {
    for(int i = topIndex; i >= 0; i--) 
      System.out.print(stackArray[i]);
  }
}
