public class MultiDimensionalArray {
  public static void main(String[] args) {
    int nums[][] = new int[3][4];

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        nums[i][j] = (int) (Math.random() * 10);
      }
    }

    // print
    printNewForLoop(nums);
    System.out.println("----------");
    print(nums);

    // jagged Arrays
    int jagged[][] = new int[3][];
    jagged[0] = new int[3];
    jagged[1] = new int[4];
    jagged[2] = new int[2];

    System.out.println("----------");
    print(jagged);
    System.out.println("----------");
    printNewForLoop(jagged);
  }

  public static void print(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print((arr[i][j]) + "    ");
      }
      System.out.println();
    }
  }

  public static void printNewForLoop(int arr[][]) {
    for (int rows[] : arr) {
      for (int elem : rows) {
        System.out.print(elem + "    ");
      }
      System.out.println();
    }

  }
}
