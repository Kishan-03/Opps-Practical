class Rectangle {

    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
