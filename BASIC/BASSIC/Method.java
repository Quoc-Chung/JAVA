import java.util.Arrays;
import java.util.Scanner;
public class Method{
    public static void main(String[] args){
        byte[] a= {10,20,30};
     /* Hiển thị tất cả các phần tử của mảng ngăn cách bằng dấu phẩy [10, 20, 30] */
        System.out.println(Arrays.toString(a));



        String[] MaTran = new String[]{
            "ONE","TRUE","TREE","FOUR"
        };
        /* Không thể dùng deepToString in ra ma trận thường  */
         System.out.println(Arrays.deepToString(MaTran));
        String[][]  MaTranThuc = new String[][] { 
            { "ONE", "TWO", "THREE", "FOUR" }, 
            { "FIVE", "SIX", "SEVEN" },
            { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" } 
        };
        System.out.println(Arrays.deepToString(MaTranThuc));


        String[][] MaTranX = new String[][] { 
            { "ONE", "TWO", "THREE", "FOUR" }, 
            { "FIVE", "SIX", "SEVEN" },
            { "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE" } 
        };
        System.out.println(Arrays.deepToString(MaTranX));


        int[] x = {6,7,9,4,2,3,6,7};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        /* Tìm kiếm nhị phân phải được sắp xếp trước  */
        int[] i = { 24, 13, 45, 37, 84, 13, 28 };
        Arrays.sort(i);
        System.out.println("Nhap gia tri tim kiem :");
        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();

        System.out.println(Arrays.binarySearch(i,tmp));
        scanner.close();

       /* fill dùng để gán tất của một mảng với một giá trị  */
        int[] fill = new int[5];
        Arrays.fill(fill, 10); // Assigns 10 to each element of the array
        System.out.println(Arrays.toString(fill)); // Output : [10, 10, 10, 10, 10]
 

        
         // An array of int
         int[] copy = { 1, 21, 15, 48, 79 };
         // Copying some part of array i into array i1
         int[] i1 = Arrays.copyOfRange(copy, 2, 7);
         System.out.println(Arrays.toString(i1)); // Output : [15, 48, 79, 0, 0]
        
        
    }
}