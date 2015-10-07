public class CharStack {
  protected char[] stackArray;
  protected int topIndex;

  public CharStack(int capacity) {
    stackArray = new char[capacity];
    topIndex = -1;
  }

  public void push(char ch) {
    stackArray[++topIndex] = ch;
  }

  public char pop() {
    return stackArray[topIndex--];
  }

  public char peek() {
    return stackArray[topIndex];
  }

  public boolean isEmpty() {
    return topIndex < 0;
  }
}
