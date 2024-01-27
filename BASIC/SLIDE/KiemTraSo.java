import java.util.Scanner;


public class KiemTraSo {
    public static boolean LaSoHayKhong(String str) {
        // Biểu thức chính quy kiểm tra chuỗi có chứa toàn bộ là số không
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String input = scanner.nextLine();

        String[] numbers = input.split("\s+");
        boolean flag = true;
        // Kiemm tra xem tung ki tu tỏng mang co la so khong 
        for (String number : numbers){
           if(!LaSoHayKhong(number)){
               System.out.println("false");
               flag =false;
               break;
           }
        }
        if(flag){
            System.out.println("true, co "+ numbers.length +" so ");
        }
        scanner.close();
    }
}
