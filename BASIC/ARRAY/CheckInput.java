package ARRAY;
import java.util.Scanner;

public class CheckInput{
    public int CheckNhapSo() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap mot so: ");
                number = scanner.nextInt();
                break;
            } catch (Exception e) {
                scanner.nextLine(); // Đọc và loại bỏ giá trị không hợp lệ khỏi bộ đệm
            }
        }
        scanner.close();
        return number;
    }

    public static void main(String[] args) {
        CheckInput c = new CheckInput();
        int number = c.CheckNhapSo();
        System.out.println("So vua nhap la : " + number);
    }
}
