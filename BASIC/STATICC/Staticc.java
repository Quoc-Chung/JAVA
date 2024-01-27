import java.util.*;
public class Staticc {
    public static void main(String[] args) {
        Circle c1 = new Circle();  // Khởi tạo đối tượng c1   : 1 
        c1.TinhToan();  // Gọi phương thức trên đối tượng đã được khởi tạo  :   5   

        Circle c2 = new Circle();  // Khởi tạo đối tượng c2  : 6 
        Circle c3 = new Circle();  // Khởi tạo đối tượng c3  : 7 

        c2.TinhToan();  // Gọi phương thức trên đối tượng đã được khởi tạo : 5 
        
        c3.Tru();    // : 4 
        System.out.printf("\nSo doi tuong :" + Circle.get_So_Doi_Tuong_Duoc_Tao()); // 4 
    }
}
