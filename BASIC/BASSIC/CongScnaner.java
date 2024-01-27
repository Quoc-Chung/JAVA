import java.util.Scanner;

public class CongScnaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thu nhat :");
        var number1 = scanner.next();
        System.out.println("Nhap so thu hai:");
        var number2 = scanner.next();

        scanner.close();

        var Tong = number1 + number2;
        System.out.println("Tong cua hai so la " + Tong);
    }
}                                                                                                                    
/* - Để nó không bị xuống dòng có thể dùng next thay vì dùng next double */
