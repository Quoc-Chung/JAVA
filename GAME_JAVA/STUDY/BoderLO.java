import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton; // Thêm dòng này vào

public class BoderLO {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setSize(400, 300);

        // Đảm bảo chương trình kết thúc khi đóng cửa sổ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo các nút
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Sử dụng BorderLayout cho JFrame
        frame.setLayout(new BorderLayout());

        // Thêm các nút vào các vị trí tương ứng
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
