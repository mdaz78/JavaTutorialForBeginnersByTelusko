public class Loops {
  public static void main(String args[]) {
    // while...loop
    int i = 1;
    while (i < 6) {
      System.out.println(i);
      i += 1;
    }

    System.out.println("----");

    // do...while...loop
    int j = 1;
    do {
      System.out.println(j);
      j += 1;
    } while (j < 6);

    System.out.println("----");

    // for...loop
    for (int k = 1; k < 5; k++) {
      System.out.println(k);
    }
  }
}
