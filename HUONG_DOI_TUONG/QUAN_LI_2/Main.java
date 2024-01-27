import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap n:");
        int n = scanner.nextInt();
        Book[] books = new Book[n];
        books[0] = new Book();
        // NhapNhieu method will now correctly use the existing objects in the array
        books[0].NhapNhieu(books, n);

        // XuatNhieu method to display the information
        books[0].XuatNhieu(books, n);
    }
}