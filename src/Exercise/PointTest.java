package Exercise;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(3.5f, 2.0f);

        System.out.println(point);
        point.setX(5.0f);
        point.setY(7.0f);
        System.out.println(point);
    }
}
