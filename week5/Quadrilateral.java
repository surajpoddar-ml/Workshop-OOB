package week5;


public class Quadrilateral extends Shape {
    private double side1, side2, side3, side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public void calculateArea() {
        // Using average of opposite sides (approximation for general quadrilateral)
        double area = ((side1 + side3) / 2) * ((side2 + side4) / 2);
        System.out.println("Area of Quadrilateral (approx): " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = side1 + side2 + side3 + side4;
        System.out.println("Perimeter of Quadrilateral: " + perimeter);
    }
}