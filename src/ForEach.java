class Student {
  String name;
  int rollNo;
  int marks;
}

public class ForEach {
  public static void main(String[] args) {

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

    // for-each loop
    for (Student student : students) {
      System.out.println(student.name);
      System.out.println(student.marks);
      System.out.println(student.rollNo);
      System.out.println("-------------");
    }
  }
}
