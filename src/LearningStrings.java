public class LearningStrings {
  public static void main(String[] args) {
    // Strings Basics
    String name = "Zafar";

    System.out.println(name.concat(" Mustafa"));
    System.out.println(name.hashCode());
    System.out.println(name.charAt(2));

    System.out.println("--------");

    // Mutable vs Immutable Strings
    // Strings are by default Mutable
    String name1 = "Zafar";
    System.out.println(name.equals(name1));

    name += " Mustafa";
    System.out.println(name);
  }
}
