package oops_practical;

public class Main {
    public static void main(String[] args) {
        Arthematic obj = new Arthematic(); // fixed name

        int x = 20, y = 5;

        obj.add(x, y);
        obj.subtract(x, y);
        obj.multiply(x, y);
        obj.divide(x, y);
    }
}
