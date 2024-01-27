/*
 - Nhap mang ho ten sinh vien 
 - In danh sach sinh vien theo yeu cau chu in hoa 
 - Thuc hien thao tac tim kiem 
 - Kiem tra neu username =hello , pass >= 8 kí tu thi in ra danh sách tren 
 */
import java.util.Scanner;

public class HoTen {
   
    public static void show() {
        String[] HT = {"Le Quoc Chung", "Vo Hong An", "Ho Thanh Cuong", "Nguyen Hoang Hung"};
        System.out.println("\nDanh sach sinh vien viet hoa :");
        for (String x : HT) {
            System.out.println(x.toUpperCase());
        }

        System.out.println("\nDanh sach sinh vien co ho Le hoac Nguyen:");
        for (String x : HT) {
            if (x.startsWith("Le") || x.startsWith("Nguyen")) {
                System.out.println(x);
            }
        }


        System.out.println("\nDanh sach sinh vien co ten An:");
        for (String x : HT) {
            if (x.endsWith("An")) {
                System.out.println(x);
            }
        }


        System.out.println("\nDanh sach sinh vien co dem hoac ten Thanh");
        for (String x : HT) {
            if (x.contains("Thanh")) {
                System.out.println(x);
            }
        }
        
        System.out.println("")

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ten, mk; 
        String usernameCorrect = "Chung"; 
        String passwordCorrect = "12345678";
        int dem = 1;

        while (dem <= 3) {
            System.out.print("\nNhap username: ");
            ten = scanner.nextLine();
            System.out.print("Nhap password: ");
            mk = scanner.nextLine();

            if (ten.equalsIgnoreCase(usernameCorrect) && mk.equals(passwordCorrect)) {
                System.out.println("Dang nhap thanh cong!");
                show();         
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

