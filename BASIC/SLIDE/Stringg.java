import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi:");
        String input = scanner.nextLine();

        String removeA = input.replaceAll("a", "");
        // Đảo ngược chuỗi 
        StringBuilder DaoNguoc = new StringBuilder(removeA).reverse();

        System.out.println("Chuoi sau khi loai bo 'a' va dao nguoc: " + DaoNguoc);

        // Thêm code xử lý chuỗi tại đây (ví dụ: loại bỏ ký tự 'a', đảo ngược chuỗi, v.v.)

        // Kiem tra xem cac so co dau cach khong  
        

        scanner.close();
    }
}
