public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(){
        this("Mèo",2); // "this()" gọi đến constructor có tham số tương ứng,bắt buộc phải đứng ở dòng đầu tiền trong constructor
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { // Từ khóa "This." sẽ đại diện cho đối tượng đang sử dụng
        return name;
    }

    public int getAge() {
        return age;
    }
}
