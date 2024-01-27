import java.util.Scanner;

class Book {
    private int MaSach;
    private String TenSach;
    private String TenTacGia;

    public Book() {
        MaSach = 0;
        TenSach = "";
        TenTacGia = "";
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap MaSach :");
        MaSach = scanner.nextInt();
        System.out.print("\nNhap Ten Sach:");
        scanner.nextLine();
        TenSach = scanner.nextLine();
        System.out.print("\nNhap ten tac gia:");
        TenTacGia = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("\nMa sach :" + MaSach);
        System.out.println("Ten sach:" + TenSach);
        System.out.println("Ten tac gia :" + TenTacGia);
    }

    public void NhapNhieu(Book[] k, int n) {
        System.out.println("\nNHAP THONG TIN .");
        for (int i = 0; i < n; i++) {
            k[i] = new Book();
            k[i].Nhap();  // Use the existing Book object in the array
        }
    }

    public void XuatNhieu(Book[] k, int n) {
        System.out.println("\nXUAT THONG TIN.");
        for (int i = 0; i < n; i++) {
            k[i].Xuat();
        }
    }
}


