 
import java.util.*;
public class Circle {
    private int x;
    private int y;
    private int z;
    private static int So_Doi_Tuong_Duoc_Tao;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        Circle.So_Doi_Tuong_Duoc_Tao++;
    }
    public void Tinh(){
        int a   = x + y + z;
        System.out.print(a);
    }
    public void TinhToan() {
        Circle.So_Doi_Tuong_Duoc_Tao = 5;  // Sử dụng tên của lớp để truy cập biến static
    }

    public void Tru(){
        Circle.So_Doi_Tuong_Duoc_Tao --;
    }

    public static int get_So_Doi_Tuong_Duoc_Tao() {
        return So_Doi_Tuong_Duoc_Tao;
    }
}