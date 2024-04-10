public class Bird extends Animal { // sử dụng extends để kế thừa
    // khi triển khai kế thừa thì lớp lất tất cả thuộc tính và phương thức lớp cha trừ pỉvate

    private int id; // Có thể khai báo và thêm thuộc tính mới

    public Bird(){
        super();
    }
    public String go(){
        return "Bird is going";
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    // Từ khóa "Super" đại diện cho đối tượng lớp cha gần nhất
}
