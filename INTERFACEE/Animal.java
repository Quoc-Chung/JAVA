/*
- Động vật (Animal), Chim (Bird), và Cá (Fish).
- Động vật có các thuộc tính chung như tên, tuổi.
- Chim có thêm thuộc tính "loại lông" (featherType) và phương thức "bay" (fly).
- Cá có thêm thuộc tính "loại vây" (finType) và phương thức "bơi" (swim).
 */
class DongVat{
    private String Ten;
    private int Tuoi;

    public DongVat(String Ten,int Tuoi){
        this.Ten = Ten;
        this.Tuoi = Tuoi;
    }
    public void Display(){
        System.out.println("Name : "+ Ten + " , Tuoi :" + Tuoi);
    }
}

 class Bird extends DongVat{
    private String KieuBay;
    
    public Bird(String Ten , int Tuoi, String KieuBay){
        super(Ten,Tuoi);
        this.KieuBay = KieuBay;
    }
    public void fly() {
        System.out.println("Flying...");
    }
    public void Display() {
        super.Display();
        System.out.println("Feather Type: " + KieuBay);
    }

}
 class Fish extends DongVat{
    private String LoaiCa;
    public Fish(String Ten, int Tuoi , String LoaiCa){
 /* - super trỏ đến đúng cái lớp cha cùng chức năng lớp con  */
        super(Ten, Tuoi);
        this.LoaiCa =  LoaiCa;
    }

    public void swim() {
        System.out.println("Swimming...");
    }
    public void Display(){
        super.Display();
        System.out.println("Loai ca : "+ LoaiCa);
    }
}


public class Animal {
    public static void main(String[] args) {
        Bird sparrow = new Bird("Sparrow", 2, "Bay Lui ");
        Fish salmon = new Fish("Salmon", 3, "Ca Oc Cho ");

        /*- Gọi phương thức từ lớp cơ sở và dẫn xuất -  */
        sparrow.Display();
        sparrow.fly();

        salmon.Display();
        salmon.swim();

    }
}
