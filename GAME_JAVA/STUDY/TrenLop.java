import java.util.Scanner;

public class HoTen {
    public static void show(String[] HT) {
        System.out.println("\nDanh sach sinh vien viet hoa :");
        for (String x : HT) {
            System.out.println(x.toUpperCase());
        }
    }

    public static void main(String[] args) {
        String[] HT = {"Tu Quoc Chung", "Vo Hong Nhung", "Ho Van Cuong", "Vo Hoang Hung"};
        Scanner scanner = new Scanner(System.in); // Chỉnh sửa: thêm System.in để đọc từ bàn phím
        String ten, mk; // Khai báo biến ten và mk
        String usernameCorrect = "your_username"; 
        String passwordCorrect = "your_password";
        int dem = 1;

        while (dem <= 3) {
            System.out.print("\nNhap username: ");
            ten = scanner.nextLine();
            System.out.print("Nhap password: ");
            mk = scanner.nextLine();

            if (ten.equalsIgnoreCase(usernameCorrect) && mk.equals(passwordCorrect)) {
                System.out.println("Dang nhap thanh cong!");
                show(HT);
                break;
            } else {
                System.out.println("Dang nhap that bai. Vui long thu lai!");
            }
            dem++;
        }

        if (dem > 3) {
            System.out.println("Da qua so lan dang nhap. Ket thuc chuong trinh.");
            System.exit(0);
        }
    }
}
