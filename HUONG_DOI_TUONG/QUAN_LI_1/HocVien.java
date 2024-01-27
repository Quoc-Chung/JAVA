import java.util.*;
class HocVien extends Nguoi {
    private int ThoiGianThamGia;
    private int SoLanTuongTac;

    public HocVien() {
        ThoiGianThamGia = 0;
        SoLanTuongTac = 0;
    }

    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.print("\nNhap TGTG :");
        ThoiGianThamGia = scanner.nextInt();
        System.out.print("\nNhap so lan tuong tac:");
        SoLanTuongTac = scanner.nextInt();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.print("\nThoi gian tham gia:" + ThoiGianThamGia);
        System.out.print("\nSo lan tuong tac :" + SoLanTuongTac);
    }

    public void NhapThongTin(HocVien[] hv, int n) {
        System.out.println("NHAP THONG TIN :");
        for (int i = 0; i < n; i++) {
            hv[i] = new HocVien(); // Initialize each object in the array
            hv[i].Nhap();
        }
    }

    public void XuatThongTin(HocVien[] hv, int n) {
        System.out.println("\nTHONG TIN HOC VIEN :");
        for (int i = 0; i < n; i++) {
            hv[i].Xuat();
        }
    }
}

