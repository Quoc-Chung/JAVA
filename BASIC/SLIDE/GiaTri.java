import java.util.Scanner;

public class GiaTri {
    public static int GiaiThua(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
             return n*GiaiThua(n-1);
        }
    }
    public static void main(String[] args){
        float S =1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int x = scanner.nextInt();
        for(int i =1;i<=n;i++){
           S+=1*x;
        }
        System.out.println("S =" +S);
        scanner.close();
    }
}
