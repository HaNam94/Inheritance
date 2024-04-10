package A;

public class Main {
    public static void main(String[] args){
        Student student = new Student(1,"Linh", 20);
        student.speak();

        Person person = new Person(1,"C02");
        person.speak();

        Person p = new Student(1, "Linh", 2);
        //Kiểu khai báo  Kiểu thực tế
        //Đối tượng có kiểu dữ liệu lớp tham chiếu đến đối tượng của lớp con
        p.speak();
        System.out.println(p instanceof Student);
        // Toán tử "instanceof" giúp kiểm tra kiểu của 1 đối tượng
    }
}
