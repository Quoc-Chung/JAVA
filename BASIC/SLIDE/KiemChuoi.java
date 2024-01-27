import java.util.Scanner;

public class KiemChuoi {
    public static boolean KiemTraChuoiSo(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        for (char x : s.toCharArray()) {
            if (!Character.isDigit(x)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LaSoHayKhong(String str) {
        // Biểu thức chính quy kiểm tra chuỗi có chứa toàn bộ là số không
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String so = scanner.nextLine();

        String[] chuoi_so = so.split("\s+"); // chỉ giữ lại các ký tự số
        for (String x : chuoi_so) {
            System.out.print(x + " , ");
        }
        boolean check = true;
        for (String x : chuoi_so) {
            if (!LaSoHayKhong(x)) {
                check = false;
                System.out.println("false");
                break;
            }
        }
        if (check) {
            System.out.println("\ntrue , co " + chuoi_so.length + " so");
        }

        scanner.close();
    }
}
/*
 * S_input = “2 34.5 -12.9 0 12 1.98”
 * ◼ Output: true, có 6 số.
 * ◼ S_input = “2 34.5 -12a.9 0 12 1b.98”
 * ◼ Output: false.
 */