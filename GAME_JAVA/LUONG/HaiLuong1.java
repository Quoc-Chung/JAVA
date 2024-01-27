import javax.swing.JFrame;

public class  HaiLuong1  {
    public static void main(String[] args) {
        // Tạo một JFrame cho luồng 1
        JFrame frame1 = new JFrame("Frame 1");
        frame1.setSize(300, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một JFrame cho luồng 2
        JFrame frame2 = new JFrame("Frame 2");
        frame2.setSize(300, 200);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo luồng 1 và hiển thị JFrame 1
        Thread thread1 = new Thread(() -> {
            frame1.setVisible(true);
        });

        // Tạo luồng 2 và hiển thị JFrame 2
        Thread thread2 = new Thread(() -> {
            frame2.setVisible(true);
        });

        // Bắt đầu thực thi cả hai luồng
        thread1.start();
        thread2.start();
    }
}