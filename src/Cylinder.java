public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Surface Area: 2πr^2+2πrh simplified to 2πr(r+h)
    @Override
    public double surface_area() {
        return (2 * Math.PI * radius * (radius + height));
    }

    // Volume: πr^2h
    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    public String toString() {
        return "Cylinder:\n" +
                "  Surface Area: " + String.format("%.2f", surface_area()) + "\n" +
                "  Volume: " + String.format("%.2f", volume());
    }
}
