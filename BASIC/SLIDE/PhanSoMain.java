import java.util.Scanner;

public class PhanSoMain {
    public static void main(String[] args) {
        /*
         * PhanSo p1 = new PhanSo(2, 4);
         * PhanSo p2 = new PhanSo(3, 5);
         * p1.Xuat();
         * 
         * PhanSo p3 = new PhanSo();
         * 
         * p3 = p1.Cong(p1, p2);
         * 
         * p3.Xuat();
         * 
         * PhanSo p4 = new PhanSo(6, 8);
         * int ss = p4.SoSanh(p4, p3);
         * if (ss == 1) {
         * System.out.println("Hai phan so bang nhau.");
         * } else if (ss == 2) {
         * System.out.println("Phan so p4 < p3");
         * } else {
         * System.out.println("Phan so p4 > p3");
         * }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap n: ");
        int n = scanner.nextInt();

        PhanSo[] ps = new PhanSo[n];

        for (int i = 0; i < n; i++) {
            ps[i] = new PhanSo();
            ps[i].Nhap();
        }
        System.out.println("\nXUAT DAY PHAN SO:");

        for (int i = 0; i < n; i++) {
            ps[i].Xuat();
        }
        ps[0].PhanSoMax(ps, n);
        PhanSo Tong = new PhanSo();
        Tong = ps[0].TongCacPhanSo(ps, n);
        System.out.println("\nTong cac phan so la :");
        Tong.Xuat();

        scanner.close();
    }
}
