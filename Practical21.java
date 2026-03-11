class VolumeCalculator {
double calculateVolume(double side) { return side * side * side;
}
double calculateVolume(double length, double width, double height) { return length * width * height;
}
double calculateVolume(float radius) {
return (4.0 / 3.0) * Math.PI * radius * radius * radius;
}
}
public class Main {
public static void main(String[] args) { VolumeCalculator vc = new VolumeCalculator();"); System.out.println("240390107014");
double cubeVolume = vc.calculateVolume(5.0);
double rectangularCubeVolume = vc.calculateVolume(4.0, 3.0, 2.0); double sphereVolume = vc.calculateVolume(3.0f); System.out.println("Volume of Cube: " + cubeVolume);
System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume); System.out.println("Volume of Sphere: " + sphereVolume);
}
}
