class University { static int totalStudents;
static String universityName; static {
universityName = "Global Tech University";
System.out.println("Static block executed: University Name initialized.");
}
{
System.out.println("Instance block executed: A new student object is being created.");
}
University() { totalStudents++;
System.out.println("Constructor executed: Student object created.");
}
static int getTotalStudents() { return totalStudents;
}
}
public class Main1 {
public static void main(String[] args) { System.out.println("Program started."); System.out.println("240390107014"); University s1 = new University(); University s2 = new University(); University s3 = new University();
System.out.println("Total Students: " + University.getTotalStudents());
}
}
