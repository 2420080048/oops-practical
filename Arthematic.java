package oops_practical;

public class Arthematic {

    void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    void divide(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Arthematic obj = new Arthematic();

        obj.add(10, 5);
        obj.subtract(10, 5);
        obj.multiply(10, 5);
        obj.divide(10, 5);
        obj.divide(10, 0);
    }
}
