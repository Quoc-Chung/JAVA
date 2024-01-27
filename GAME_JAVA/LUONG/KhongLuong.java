import javax.swing.JFrame;
public class KhongLuong {
    public static void main(String[] args) {
       JFrame jframe1 = new JFrame();
        jframe1.setTitle("CHUONG TRINH TEST HINH VE 1");
        jframe1.setSize(500, 300);
        jframe1.setLocationRelativeTo(null);
        jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame jframe2= new JFrame();
        jframe2.setTitle("CHUONG TRINH TEST HINH VE 2");
        jframe2.setSize(500, 300);
        jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe1.setVisible(true);
        jframe2.setVisible(true);
    }
}
