import java.util.Scanner;

class Circle {
    private double radius;
    private double circleCount = 0;

    public Circle(double radius) {
        setRadius(radius);
        circleCount++;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleCount() {
        return circleCount;
    }

    public double getArea() {
        double area = radius * 2 * Math.PI;
        return area;
    }

    public double getCircumference() {
        double circumference = radius * radius * Math.PI;
        return circumference;
    }
}

class testCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");

        double radius = input.nextDouble();
        Circle obj = new Circle(radius);

        double area = obj.getArea();
        double circumference = obj.getCircumference();

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}