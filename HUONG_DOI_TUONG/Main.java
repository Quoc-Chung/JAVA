// Lớp trừu tượng
abstract class Shape {
    // Phương thức trừu tượng
    abstract void draw();

    // Phương thức trừu tượng khác
    abstract double calculateArea();
}

// Lớp con kế thừa từ lớp trừu tượng
class Circle extends Shape {
    private double radius;

    // Phương thức triển khai draw cho Circle
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    // Phương thức triển khai calculateArea cho Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Lớp con khác kế thừa từ lớp trừu tượng nhưng không triển khai đủ phương thức
class Square extends Shape {
    private double side;

    // Phương thức triển khai draw cho Square
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
    // Không triển khai calculateArea, do đó lớp này phải được đánh dấu là trừu tượng
    @Override 
    double calculateArea(){
        // System.out.println("toi lam cho co.");
        return 5;
    }
    // Lớp Square không triển khai đủ phương thức, nên nó cũng phải là trừu tượng
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        // Square square = new Square(); // Lỗi vì Square là lớp trừu tượng
    }
}
