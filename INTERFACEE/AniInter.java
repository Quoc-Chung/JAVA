interface TrinhBay{
    void Display();
}
class DongVat implements TrinhBay{
    private String Ten;
    private int Tuoi;

    public DongVat(String Ten,int Tuoi){
        this.Ten = Ten;
        this.Tuoi = Tuoi;
    }
    @Override 
    public void Display(){
        System.out.println("Name : " + Ten + " , Tuoi :" + Tuoi);
    }
}

class Bird extends DongVat implements TrinhBay {
    private String KieuBay;

    public Bird(String Ten, int Tuoi, String KieuBay) {
        super(Ten, Tuoi);
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

class Fish extends DongVat implements TrinhBay{
    private String LoaiCa;

    public Fish(String Ten, int Tuoi, String LoaiCa) {
        super(Ten, Tuoi);
        this.LoaiCa = LoaiCa;
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    public void Display() {
        super.Display();
        System.out.println("Loai ca : " + LoaiCa);
    }
}



public class AniInter {
     public static void main(String[] args) {
        Bird sparrow = new Bird("Sparrow", 2, "Bay Lui ");
        Fish salmon = new Fish("Salmon", 3, "Ca Oc Cho ");

        // Gọi phương thức từ interface
        sparrow.Display();
        salmon.Display();
     }
}
