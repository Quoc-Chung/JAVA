import java.util.InputMismatchException;
import java.util.Scanner;

public class Nhapsox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=0,num2=0;

        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
             num1 = scanner.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
             num2 = scanner.nextInt();

       
        } catch (InputMismatchException e) {
            System.out.println("Ngoại lệ: Bạn phải nhập số nguyên.");
        } finally {
            int sum = num1 + num2;
            System.out.println("Tổng của " + num1 + " và " + num2 + " là: " + sum);
            scanner.close();
        }
    }
}

