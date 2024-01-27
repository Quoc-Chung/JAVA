package DE;
import java.util.Scanner;

public class TuSoDem{
    public static void  main (String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Nhap mot chuoi : ");
         String input = scanner.nextLine().trim();
         
         String[] tach = input.split("\\s+");
         System.out.print("Chuoi dau vao co do dai : "+ tach.length);
         

         scanner.close();
    }
}
