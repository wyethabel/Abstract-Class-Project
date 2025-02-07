public class ShapeArray {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(7.2);
        Cylinder cylinder1 = new Cylinder(3.1, 2);
        Cone cone1 = new Cone(2.7, 4);

        Shape[] shapeArray = {sphere1, cylinder1, cone1};
        for (Shape i : shapeArray) {
            System.out.println(i.toString());
        }
    }
}