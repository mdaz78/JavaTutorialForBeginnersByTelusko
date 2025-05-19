class Student {
  int rollNo;
  String name;
  int marks;
}

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

    // Array of Objects
    Student s1 = new Student();
    s1.name = "Zafar";
    s1.rollNo = 1;
    s1.marks = 72;

    Student s2 = new Student();
    s2.name = "Dave";
    s2.rollNo = 10;
    s2.marks = 702;

    Student s3 = new Student();
    s3.name = "Mark";
    s3.rollNo = 100;
    s3.marks = 7200;

    Student students[] = new Student[3];

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    print(students);
  }

  public static void print(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print((arr[i][j]) + "    ");
      }
      System.out.println();
    }
  }

  public static void print(Student student[]) {
    for (int i = 0; i < student.length; i++) {
      System.out.println(student[i].name);
      System.out.println(student[i].rollNo);
      System.out.println(student[i].marks);
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
