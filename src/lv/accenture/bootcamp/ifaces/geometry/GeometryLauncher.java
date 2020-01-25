package lv.accenture.bootcamp.ifaces.geometry;

public class GeometryLauncher {

    public static void main(String[] args) {
        Elements.Point a = new Elements.Point(1, 1);
        Elements.Point b = new Elements.Point(5, 2);
        Elements.Point c = new Elements.Point(3, 5);

        // Math.PI;

        Triangle abc = new Triangle(a, b, c);
        System.out.println("Triangle ABC perimeter : " + abc.perimeter());
        System.out.println("Triangle ABC area : " + abc.area());

        Circle circle = new Circle(5);
        System.out.println("Circle perimeter : " + circle.perimeter());
        System.out.println("Circle area : " + circle.area());

        VolumetricFigure cylinder = new Cylinder(5, 2);
        System.out.println("cylinder.volume() = " + cylinder.volume());
        System.out.println("cylinder.surfaceArea() = " + cylinder.surfaceArea());

        Tetrahedron tetrahedron = new Tetrahedron(abc, 4);
        System.out.println("tetrahedron.volume() = " + tetrahedron.volume());
        System.out.println("tetrahedron.surfaceArea() = " + tetrahedron.surfaceArea());

        Cone cone = new Cone(circle, 3);
        System.out.println("cone.volume() = " + cone.volume());
        System.out.println("cone.surfaceArea() = " + cone.surfaceArea());
    }
}
