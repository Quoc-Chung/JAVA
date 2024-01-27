import java.util.Scanner;
public class CongSoChan{
    public static boolean NguyenTo(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void In_Mang(int a[],int n){
        for (int i =0;i<n;i++){
            System.out.println("Phan tu thu " + (i+1) + " la :"+ a[i]);
        }
    }
    
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Nhap n:");
       int n = scanner.nextInt();
       int a[] = new int[n];
       System.out.println("Nhap mang a:");
       for (int i=0;i<n;i++){
        a[i] = scanner.nextInt();
       }
       In_Mang(a, n);
       System.out.println("Cac phan tu la so nguyen to:");
       for (int i =0;i<n;i++){
        if(NguyenTo(a[i])){
             System.out.println("Phan tu thu " + (i+1) + " la :"+ a[i]);
        }
       }
       scanner.close();
    }
}