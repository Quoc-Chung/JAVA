package DE;
import java.util.Scanner;

public class GiaiThua{
    public static int GT(int n){
    int gt = 1;
    for(int i=1;i<=n;i++){
        gt*=i;
    }
    return gt;
}
public static boolean KiemTraNguyenTo (int n){
  if(n<2){
    return false;
  }
  else {
    for (int i =2 ; i<= Math.sqrt(n);i++){
        if(n% i ==0 ){
            return false;
        }
    }
  }
 return true;
}
    public static void main (String[] args){
       System.out.println("Nhap so n:");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int kq = GT(n);
       scanner.close();
       System.out.println("Ket qua cua " + n+"! = " + kq);


       System.out.println("Nam so nguyen to dau  tien :" ) ;
       int  dem = 0 ;
       for(int  i =0 ;i< 1000 ;i++ ){
        if (KiemTraNguyenTo(i)){
             System.out.print("  "+i);
             dem++;
             if(dem == 5){
                break;
             }
       }
    }
}
}