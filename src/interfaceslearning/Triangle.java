package interfaceslearning;

public class Triangle implements Polygon {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return base * height / 2.0;
    }
}
