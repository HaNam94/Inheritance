package Exercise;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point = new Point2D(3.5, 2.0);

        System.out.println(point);

        point.setX(5.0);
        point.setY(7.0);
        System.out.println(point);
    }
}
