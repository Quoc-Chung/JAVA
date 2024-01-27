package DE;
import java.util.Scanner;
public class DemSoTu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap chuoi :");
        String s = scanner.nextLine();
        String[] Tach = s.split("\\s+");
        int DemSoTu = Tach.length;
        System.out.println("So tu  trong chuoi : " + DemSoTu);
        scanner.close();
    }
}