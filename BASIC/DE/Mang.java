package DE;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Mang {
    public int KiemTraNhap(Scanner scanner) {
        int n = 0;
        while (true) {
            try {
                System.out.print("Nhap mot so: ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhap khong hop le. Nhap lai.");
                scanner.next(); // Loại bỏ giá trị không hợp lệ khỏi bộ đệm
            }
        }
        // Không đóng Scanner nếu bạn muốn giữ mở System.in cho các đoạn mã khác.
        return n;
    }
    public void Max_Min(int[] a, int n) {
        int max = (int) -Math.pow(10, 9);
        int min = (int)  Math.pow(10, 9);
        
        for (int i = 0; i < n; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
            if (min >= a[i]) {
                min = a[i];
            }
        }
        
        System.out.println("Gia tri min - max : " + min + " " + max); // Thêm dấu hai chấm giữa min và max
    }
    public void InMang(int[] a,int n){
        for(int i = 0;i<n;i++){
           System.out.print(" "+ a[i]);
        }
    }
    public void SapXep(int[] a,int n){
        Arrays.sort(a);
        System.out.println("MAng sap xep tang dan :");
        InMang(a, n);

         // Chuyển mảng a sang Integer để sắp xếp giảm dần
         Integer[] array = Arrays.stream(a).boxed().toArray(Integer[]::new);
         Arrays.sort(array, Collections.reverseOrder());
         
         System.out.println("Mang sap xep giam dan : ");
         for (var x : array){
            System.out.print(" "+ x);
         }
    }
    /*  Hãy liệt kê số các phần tử trong dãy không nhỏ hơn các số đứng trước nó (tính cả phần tử đầu tiên). */
    
    
    public static void main(String[] args){
        Mang m = new Mang();
        Scanner scanner = new Scanner(System.in);
        int n = m.KiemTraNhap(scanner);

       int[] a = new int[n];
       for (int i = 0; i < n; i++) {
       a[i] = scanner.nextInt();
    }
        m.Max_Min(a, n);
        scanner.close();

        m.SapXep(a,n);
        
    }
}
