package Exercise;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.5,"Red", 5.0);

        System.out.println(cylinder);
        System.out.println("volume: " + cylinder.getVolume());

        cylinder.setRadius(5.0);
        cylinder.setColor("Blue");
        cylinder.setHeight(7.0);

        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
