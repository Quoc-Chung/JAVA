import java.util.Scanner;

public class PhanSo {
    private int x, y;

    private static Scanner scanner = new Scanner(System.in);

    public PhanSo() {
        x = y = 0;
    }

    public PhanSo(int Tu_So, int Mau_So) {
        this.x = Tu_So;
        this.y = Mau_So;
    }

    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public PhanSo RutGon() {
        int glc = UCLN(x, y);
        x /= glc;
        y /= glc;
        if (y < 0) {
            x *= (-1);
            y *= (-1);
        }
        return this;
    }

    public void Nhap() {
        System.out.print("\nNhap tu so: ");
        this.x = scanner.nextInt();
        System.out.print("\nNhap mau so: ");
        this.y = scanner.nextInt();
        // scanner.close();
    }

    public void Xuat() {
        RutGon();
        System.out.println("\n" + x + " / " + y);
    }

    public void NhapThongTin(PhanSo[] ps, int n) {
        System.out.println("Nhap thong tin :");
        for (int i = 0; i < n; i++) {

            ps[i].Nhap();
        }
    }

    public PhanSo Cong(PhanSo p1, PhanSo p2) {
        PhanSo T = new PhanSo();
        T.x = p1.x * p2.y + p2.x * p1.y;
        T.y = p1.y * p2.y;
        return T.RutGon();
    }

    public PhanSo Tru(PhanSo p1, PhanSo p2) {
        PhanSo T = new PhanSo();
        T.x = p1.x * p2.y - p2.x * p1.y;
        T.y = p1.y * p2.y;
        return T.RutGon();
    }

    public PhanSo Nhan(PhanSo p1, PhanSo p2) {
        PhanSo T = new PhanSo();
        T.x = p1.x * p2.x;
        T.y = p1.y * p2.y;
        return T.RutGon();
    }

    public PhanSo Chia(PhanSo p1, PhanSo p2) {
        PhanSo T = new PhanSo();
        T.x = p1.x * p2.y;
        T.y = p1.y * p2.x;
        return T.RutGon();
    }

    public int SoSanh(PhanSo p1, PhanSo p2) {
        // Chuyển về cùng mẫu số
        int chung = p1.y * p2.y;
        p1.x *= p2.y;
        p2.x *= p1.y;
        p1.y = chung;
        p2.y = chung;
        // So sánh tử số
        if (p1.x == p2.x) {
            return 1;
        } else if (p1.x < p2.x) {
            return 2;
        } else {
            return 3;
        }
    }

    public void PhanSoMax(PhanSo[] ps, int n) {
        int max = (int) -Math.pow(10, 5);
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (max < (ps[i].x / ps[i].y)) {
                max = ps[i].x / ps[i].y;
                tmp = i;
            }
        }
        System.out.println("Phan so lon nhat la :");
        ps[tmp].Xuat();
    }

    public PhanSo TongCacPhanSo(PhanSo[] ps, int n) {
        PhanSo tong = new PhanSo(0, 1);
        for (int i = 0; i < n; i++) {
            tong = tong.Cong(tong, ps[i]);
        }
        return tong.RutGon();
    }
    /* - Hàm kiểm tra xem phân số có là số nguyên hay không - */

    public boolean LaSoNguyen() {
        // Kiểm tra nếu mẫu số là 1 hoặc phân số là 0
        if (y == 1 || x == 0) {
            return true;
        }
        // Kiểm tra xem phân số có chia hết cho mẫu số hay không
        return x % y == 0;
    }

    public static void closeScanner() {
        scanner.close();
    }
}