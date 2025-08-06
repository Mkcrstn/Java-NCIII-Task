package Tasks;

// Interface: Shape
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Abstract Class: AbstractShape
abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculatePerimeter();
}

// Concrete Class: Circle
class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width not used for circle
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete Class: Rectangle
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main Class
public class Task15 {
    public static void main(String[] args) {
        Shape circle = new Circle("Teal", 5.0);
        Shape rectangle = new Rectangle("Sky Blue", 4.0, 6.0);

        System.out.println("Circle:");
        System.out.println("Color: " + ((Circle) circle).getColor());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + ((Rectangle) rectangle).getColor());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

