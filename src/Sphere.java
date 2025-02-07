public class Sphere extends Shape{
    private double radius;

    public Sphere() {
        this.radius = 0.0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    // Surface Area: A=4πr^2
    @Override
    public double surface_area() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    // Volume: 4/3πr^3
    @Override
    public double volume() {
        return ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }

    public String toString() {
        return "Sphere:\n" +
                "  Surface Area: " + String.format("%.2f", surface_area()) + "\n" +
                "  Volume: " + String.format("%.2f", volume());
    }
}
