package DE;
import java.util.Scanner;
public class NguyenTo {
    public static boolean NguyenToPhai(int n){
        if( n <2 ){
          return false;
        }
        else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main( String[] args){
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();

        System.out.println("Tat ca cac so nguyen to  nho hon 100 :");
        for  (int i=0;i<n;i++){
            if(NguyenToPhai(i)){
                System.out.print(" "+i);
            }
        }
        scanner.close();

    }
}
