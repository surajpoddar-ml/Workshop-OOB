// Quadrilateral class implementing Shape
public class Quadrilateral extends Shape {
    private double length;
    private double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Quadrilateral: " + (length * width));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Quadrilateral: " + (2 * (length + width)));
    }
}
