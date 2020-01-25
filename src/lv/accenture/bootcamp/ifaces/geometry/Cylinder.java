package lv.accenture.bootcamp.ifaces.geometry;

public class Cylinder extends Round implements VolumetricFigure {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double volume() {
        return new Circle(radius).area() * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
