import java.util.*;

public class Nguoi {
    private String HoTen;
    private int MaSo;
    private int NamSinh;
    private String GioiTinh;

    public Nguoi() {
        HoTen = GioiTinh = "";
        MaSo = NamSinh = 0;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ho va ten :");
        HoTen = scanner.nextLine();
        System.out.print("\nNhap ma so : ");
        MaSo = scanner.nextInt();
        System.out.print("\nNhap nam sinh: ");
        NamSinh = scanner.nextInt();
        System.out.print("\nNhap gioi tinh :");
        GioiTinh = scanner.next();
    }

    public void Xuat() {
        System.out.print("\nHo va ten :" + HoTen);
        System.out.print("\nMa so : " + MaSo);
        System.out.print("\nNam sinh :" + NamSinh);
        System.out.print("\nGioi tinh : " + GioiTinh);
    }
}
