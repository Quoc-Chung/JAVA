import java.util.Scanner;
// Nhập số nguyên dương n = 6677
// Tổng của các chữ số của 6677 là: 26
public class TongChuSoi{
    public static void main (String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Nhap so nguyen duong n = ");
      int n = scanner.nextInt();
      int tmp = n;
      int tong  = 0; 
      while ( n > 0){
        tong+= n %10; 
        n/=10;
      }
      System.out.println("Tong cac chu so cua "+tmp+" la "+tong);
      scanner.close();
    }
}
