package Exercise;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point = new Point3D(3.5, 2.0, 4.0);

        System.out.println(point);

        point.setX(5.0);
        point.setY(7.0);
        point.setZ(9.0);

        System.out.println(point);
    }
}
