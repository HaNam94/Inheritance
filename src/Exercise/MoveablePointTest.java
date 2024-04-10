package Exercise;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(3.5f, 2.0f, 1.0f, 1.5f);

        System.out.println(point);
        point.move();
        System.out.println(point);
    }
}
