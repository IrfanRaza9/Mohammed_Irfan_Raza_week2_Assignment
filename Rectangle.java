package week2;

//MethodOverloading Solution3
public class Rectangle {
    private double length;
    private double width;


    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double area(double side) {
        return side * side;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        System.out.println("Area (default constructor): " + rect1.area());


        Rectangle rect2 = new Rectangle(5.0);
        System.out.println("Area of square " + rect2.area());


        Rectangle rect3 = new Rectangle(4.0, 6.0);
        System.out.println("Area of rectangle " + rect3.area());

        }
}
