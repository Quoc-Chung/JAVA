package DE;
import java.util.Scanner;

public class PhuongTrinh{
    public static void main(String[] args) { // Thêm tham số args vào phương thức main
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so :");
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float c = scanner.nextInt();
        scanner.close();

        float delta = (float) (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        if (delta < 0) {
            System.out.println("Phuong trinh khong co nghiem thuc");
        } else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: " + x);

        } else {
            System.out.println("Phuong trinh co hai nghiem phan biet :");
            float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1 + " X2 = " + x2);
        }
    }
}
