package DE;
import java.util.Scanner;
public class SoThuanNghich{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n:");
        int n = scanner.nextInt();
        int tmp = n;
        scanner.close();
        int tong = 0 ;
        while(n> 0){
            tong += n%10;
            n/=10;
        }
        System.out.println("Tong so thuan nghich:"+ tong);
        System.out.print("So dao nguoc :");
        while (tmp > 0){
            System.out.print(tmp%10);
            tmp/=10;
        }
    }
}