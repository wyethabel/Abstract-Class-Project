public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Surface Area: πr(r+√(h^2+r^2))
    @Override
    public double surface_area() {
        return (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
    }

    // Volume: 1/3*πr^2h
    @Override
    public double volume() {
        return ((1.0/3.0) * Math.PI * Math.pow(radius, 2) * height);
    }

    public String toString() {
        return "Cone:\n" +
                "  Surface Area: " + String.format("%.2f", surface_area()) + "\n" +
                "  Volume: " + String.format("%.2f", volume());
    }
}
