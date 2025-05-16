public class TypeCasting {
  public static void main(String args[]) {

    // Implicit Casting
    byte b = 127;
    int a = b;

    // Explicit Casting
    int i = 264;
    byte k = (byte) i;

    // Type promotion
    byte b1 = 30;
    byte b2 = 100;

    int res = b1 * b2;

    // print
    System.out.println("b => " + b);
    System.err.println("a => " + a);
    System.err.println("i => " + i);
    System.err.println("k => " + k);
    System.err.println("res => " + res);
  }
}
