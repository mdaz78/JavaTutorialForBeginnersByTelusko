public class NewSwitch {
  public static void main(String[] args) {
    String day = "Saturday";
    String result = "";

    switch (day) {
      case "Saturday", "Sunday" -> System.out.println("6am");
      case "Monday" -> System.out.println("8am");
      default -> System.out.println("7am");
    }

    day = "Friday";

    result = switch (day) {
      case "Saturday", "Sunday" -> "6am";
      case "Monday" -> "8am";
      default -> "7am";
    };

    System.out.println(result);

    day = "Tuesday";

    result = switch (day) {
      case "Saturday", "Sunday": {
        yield "6am";
      }

      case "Monday": {
        yield "8am";
      }

      case "Tuesday": {
        yield "9am";
      }

      default: {
        yield "7am";
      }
    };

    System.out.println(result);

  }
}
