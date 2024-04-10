package Exercise;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "Red");

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        circle.setRadius(5.0);
        circle.setColor("Blue");

        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
    }
}
