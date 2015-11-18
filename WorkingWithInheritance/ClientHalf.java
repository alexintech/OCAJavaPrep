interface Function {
  public int evaluate(int value);
}

class Half implements Function {
  public int evaluate(int value) {
    return value/2;
  }
}

class Print implements Function {
  public int evaluate(int value) {
    System.out.print(value + " ");
    return value;
  }
  protected void finalize() throws Throwable {
    System.out.println();
  }
}

public class ClientHalf {
  public static int[] arrayHalf(int[] array) {
    int[] resultArray = new int[array.length];
    Half half = new Half();

    for(int i = 0; i < array.length; i++) {
      resultArray[i] = half.evaluate(array[i]);
    }

    return resultArray;
  }

  public static int[] arrayProcess(int[] array, Function func) {
    int[] resultArray = new int[array.length];
    for(int i = 0; i < array.length; i++) {
      resultArray[i] = func.evaluate(array[i]);
    }
    return resultArray;
  }

  static void printArray(int[] array) {
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] result = arrayHalf(new int[] { 4, 3, 10, 8 });
    printArray(result);

    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    arrayProcess(array, new Print());
    System.out.println();
    array = arrayProcess(array, new Half());
    arrayProcess(array, new Print());
    System.out.println();
  }
}

