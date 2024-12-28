abstract class Shape {
    abstract int area();
}

class Rectangle extends Shape {
    int l = 10, b = 23;

    int area() {
        return l * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("Area: " + r1.area());
    }
}