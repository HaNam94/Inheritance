package A;

public class Student extends Person {
    private double score;
    public Student(int id, String name, double score){
        super(id, name);
        this.score = score;
    }
    public void speak(){
        System.out.println("Student is speaking");
    }
    //Ghi đè phương thức xảy ra mối quan hệ kế thừa
    // Cùng tên, cùng kiểu dữ lệu trả về, cùng tham số truyền vào
    // Khác nhau code triển khai
    // Access Modifiler ở lớp con phải rộng hơn lớp cha
}
