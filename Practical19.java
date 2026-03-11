import java.util.Scanner; class College {
String collegeName; College(String name) { this.collegeName = name;
}
class Admission { String studentName; String course;
void acceptDetails(String studentName, String course) { this.studentName = studentName;
this.course = course;
}
void displayDetails() {
System.out.println("College Name: " + collegeName); System.out.println("Student Name: " + studentName); System.out.println("Course Enrolled: " + course);
}
}
}
public class Main {
public static void main(String[] args) { System.out.println("240390107014"); Scanner sc = new Scanner(System.in);
College college = new College("Global Tech College"); College.Admission admission = college.new Admission(); System.out.print("Enter Stuent Name: ");
String name = sc.nextLine(); System.out.print("Enter Course: "); String course = sc.nextLine(); admission.acceptDetails(name, course);
System.out.println("\n--- Admission Details ---"); admission.displayDetails();
sc.close();
}
}                                       
