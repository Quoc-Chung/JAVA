import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hoc vien: ");
        n = scanner.nextInt();

        HocVien[] hv = new HocVien[n];
        hv[0] = new HocVien();
        hv[0].NhapThongTin(hv, n);

        hv[0].XuatThongTin(hv, n);

        scanner.close();
    }
}
