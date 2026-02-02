import java.util.Scanner;

class Point {

    int x;
    int y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        System.out.print("Default Constructor -> ");
        p1.display();

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.print("Parameterized Constructor -> ");
        p2.display();

        Point p3 = new Point(p2);
        System.out.print("Copy Constructor -> ");
        p3.display();
    }
}
