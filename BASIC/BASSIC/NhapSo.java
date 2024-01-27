import java.util.InputMismatchException;
import java.util.Scanner;

public class NhapSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Khai báo ở đây để có phạm vi toàn cục

        while (true) {
            try {
                System.out.println("Nhập số hoặc chữ: ");
                if (scanner.hasNextInt()) {
                    // Nếu người dùng nhập số
                    number = scanner.nextInt();
                    System.out.println("Bạn đã nhập số: " + number);
                    break; // Thoát khỏi vòng lặp
                } else {
                    // Nếu người dùng nhập chữ
                    String input = scanner.nextLine();
                    System.out.println("Bạn đã nhập chữ " + input + ". Vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                // Xử lý ngoại lệ nếu người dùng nhập không phải số nguyên
                System.out.println("Lỗi: Bạn cần phải nhập số nguyên. Vui lòng thử lại.");
                scanner.next(); // Đọc và loại bỏ giá trị không hợp lệ khỏi bộ đệm
            } finally {
                System.out.println("Số bạn vừa nhập là: " + number);
            }
        }

        scanner.close();
    }
}
