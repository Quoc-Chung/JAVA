
// import javax.swing.ImageIcon;
import javax.swing.JFrame;
// import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.SwingUtilities;
// import java.net.URL;
import java.awt.Graphics;

public class Anh {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();

        jframe.setSize(700, 500);
        jframe.setLocationRelativeTo(null);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillOval(100, 100, 100, 100);
            }
        };

        jframe.add(panel);
        // // Tạo một luồng để tải ảnh từ Internet
        // Thread imageThread = new Thread(() -> {
        // try {
        // // URL của ảnh
        // URL imageUrl = new
        // URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fsnapshot.canon-asia.com%2Fvn%2Farticle%2Fviet%2Flandscape-photography-quick-tips-for-stunning-deep-focused-images&psig=AOvVaw0zj89d0fRl61szQMZfrTj2&ust=1705476820530000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCODdu7Ky4YMDFQAAAAAdAAAAABAE");

        // // Tải ảnh
        // ImageIcon imageIcon = new ImageIcon(imageUrl);
        // JLabel label = new JLabel(imageIcon);

        // // Hiển thị ảnh trong giao diện
        // SwingUtilities.invokeLater(() -> {
        // panel.add(label);
        // jframe.revalidate();
        // jframe.repaint();
        // });
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // });
        // // Bắt đầu thực thi luồng tải ảnh
        // imageThread.start();

        // Hiển thị frame
        jframe.setVisible(true);

    }
}
