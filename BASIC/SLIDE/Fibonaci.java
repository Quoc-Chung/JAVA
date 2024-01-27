import java.util.*;

public class Fibonaci {
    public static long TinhToan(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long[] fibonaci = new long[n + 1];
            fibonaci[1] = 1;
            fibonaci[2] = 1;

            for (int i = 3; i <= n; i++) {
                fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
            }
            return fibonaci[n];
        }
    }

    public static long TinhToan_DeQuy(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return TinhToan_DeQuy(n - 1) + TinhToan_DeQuy(n - 2);
        }
    }

    /* - Tìm phần tử gần nhất với giá trị n - */
    public static int Gan_N_Nhat(int n) {
        int f1 = 0;
        int f2 = 1;
        while (true) {
            int tmp = f1 + f2;

            /* f2 --- n --- tmp => Xem thằng nào gần n hơn */
            if (tmp >= n) {
                if(tmp -n > n-f2){
                    return tmp;
                }
                else{
                    return f2;
                }
            }
            f1 = f2;
            f2 = tmp;
        }
    }

    public static void main(String[] args) {
        /* 1 1 2 3 5 8 13 21  với n = 8 thì gần n nhất là 5  */
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap so n :");
        int n = scanner.nextInt();

        long KetQua = TinhToan(n);
        System.out.println("\nGia tri cua phan tu thu n :" + KetQua);

        int Gan_N_Nhat = Gan_N_Nhat(n);
        System.out.println("Phan tu gan n nhat :"+Gan_N_Nhat);

        scanner.close();
    }
}
