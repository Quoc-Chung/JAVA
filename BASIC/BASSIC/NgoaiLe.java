import java.util.InputMismatchException;
import java.util.Scanner;
public class NgoaiLe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Nhap so nguyen:");
                int number = scanner.nextInt();
                System.out.println("Ban da nhap so : "+ number);
                break;// Thoat khoi vong lap
            }
            catch(InputMismatchException e){
                 // In thông báo lỗi và stack trace
                 System.out.println("Lỗi: Bạn cần phải nhập số nguyên.");
                 System.out.println("Thông điệp lỗi: " + e.getMessage());

                 // In ra stack trace 
                 System.out.println("StackTrace : ");
                 StackTraceElement[] st = e.getStackTrace();
                 for(StackTraceElement  x : st){
                    System.out.println(x);
                 }
            }
        }
        scanner.next();
        scanner.close();
    }    
}
