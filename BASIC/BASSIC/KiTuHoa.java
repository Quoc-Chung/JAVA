import java.util.*;

public class KiTuHoa{
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);
        char CHECK_HOA;

        while(true){
            try{
               System.out.print("Nhap mot ki tu hoa : ");
               CHECK_HOA = scanner.next().charAt(0);
               if(Character.isUpperCase(CHECK_HOA)){
                   System.out.println("Ki tu hoa da nhap :"+ CHECK_HOA);
                   break;
               } 
               else{
                   System.out.println("Ki tu vua nhap khong la ki tu hoa ");
                   System.out.println("VUI LONG NHAP LAI");
               }
            }
            catch(Exception e ){
                /* Đọc và loại bỏ dữ liệu không mong muốn từ bàn phím  */
                  scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}