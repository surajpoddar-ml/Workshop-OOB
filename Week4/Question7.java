package Week4;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    void display(String type, String values, double result) {
        System.out.println("Adding " + type + " [" + values + "] = " + result);
    }
}

public class Question7 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum2Int = calc.add(5, 8);
        calc.display("2 Integers", "5, 8", sum2Int);

        int sum3Int = calc.add(10, 15, 20);
        calc.display("3 Integers", "10, 15, 20", sum3Int);

        double sum2Double = calc.add(3.5, 2.7);
        calc.display("2 Doubles", "3.5, 2.7", sum2Double);

        double sum3Double = calc.add(1.1, 2.2, 3.3);
        calc.display("3 Doubles", "1.1, 2.2, 3.3", sum3Double);
    }

}