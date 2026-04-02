package Week4;

class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    void displayDetails() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("Verified by: Suraj");
    }
}

public class Question2 {

    public static void main(String[] args) {
        Circle myCircle = new Circle(7.0);
        myCircle.displayDetails();
    }

}