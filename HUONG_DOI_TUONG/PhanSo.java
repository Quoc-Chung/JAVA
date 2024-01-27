import java.util.Scanner;

public class PhanSo {
    private int TuSo;
    private int MauSo;

    // Hàm tạo không đối số
    public PhanSo() {
        this.TuSo = 0;
        this.MauSo = 0;
    }

    // Hàm tạo hai đối số
    public PhanSo(int TuSo, int MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    // Hàm nhập một phân số
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap tu so: ");
        this.TuSo = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        this.MauSo = scanner.nextInt();
    }

    // Hàm tính ước chung lớn nhất
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm nhân hai phân số
    public PhanSo nhan(PhanSo p) {
        PhanSo p3 = new PhanSo();
        p3.TuSo = this.TuSo * p.TuSo;
        p3.MauSo = this.MauSo * p.MauSo;
        int gcdVal = gcd(p3.TuSo, p3.MauSo); // Tính ước chung lớn nhất
        p3.TuSo /= gcdVal; // Chia tử số cho ước chung lớn nhất
        p3.MauSo /= gcdVal; // Chia mẫu số cho ước chung lớn nhất
        return p3;
    }

    public void Xuat() {
        System.out.print(this.TuSo + " / " + this.MauSo);
    }

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(4, 8);
        PhanSo p2 = new PhanSo(1, 2);

        PhanSo p3 = p1.nhan(p2);

        p1.Xuat();
        System.out.print(" * ");
        p2.Xuat();
        System.out.print(" = ");
        p3.Xuat();
    }
}

