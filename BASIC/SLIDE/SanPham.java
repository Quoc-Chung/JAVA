
public class SanPham {
    public String tenSp;
    public double donGia, giamGia;
    
    public double getThueNk(){
        return 0.1* donGia;
    }
    Scanner sc= new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ten sp:");
        this.tenSp=sc.nextLine();
        System.out.print("Don gia sp:");
        this.donGia= sc.nextDouble();
        System.out.print("Giam gia :");
        this.giamGia=sc.nextDouble();
    }
    public void xuat(){
        System.out.println("---------------------------------------------");
        System.out.println("Ten san pham :"+ this.tenSp);
        System.out.println("Don gia :%.2f"+ this.donGia);
        System.out.println("Giam gia :%.2f"+ this.giamGia);
        System.out.println("Thue NK : %.2f" + this.getThueNk());
    }
    public static void main(String[] args) {
        SanPham sp = new  SanPham();
        sq.nhap();
        sp.xuat();
        
    }
}