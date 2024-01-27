import javax.swing.JFrame;

public class ViDu {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("CHUNG CHO");
        jf.setSize(600, 400);
        /*- Hiển thị cửa sổ - */
        jf.setVisible(true);

        /* - Gán vị trí - */
        jf.setLocation(300, 300);

        /*- Thoát khỏi chương trình khi đóng cửa sổ -*/
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}