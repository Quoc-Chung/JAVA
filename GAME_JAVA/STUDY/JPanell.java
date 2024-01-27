import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanell {
    /* - Đại diện cho cửa sổ chính của khung hình - */
    private JFrame mainFrame;

    /*- Hiển thị nội dung (nhãn) cho phần đầu cửa sổ - */
    private JLabel headerLabel;

    /*- Hiển thị thông điệp của cửa sổ - */
    private JLabel statusLabel;

    /*- Chứa các thành phần điều khiển trong của sổ - */
    private JPanel controlPanel;

    private JLabel msglabel;

    private void prepareGUI() {
        mainFrame = new JFrame();
        mainFrame.setTitle("GIAO DIEN TEST JPANEL ");
        mainFrame.setSize(600, 300);

        /*- Đặt cửa sổ ra giữa màn hình - */
        mainFrame.setLocationRelativeTo(null);

        /* -Đặt layout của mainFrame thành boderlayout chia cửa sổ thành 5 khu vực- */
        // mainFrame.setLayout(new BorderLayout());

        /* - Tạo một nhẵn có nội dung trống và được căn giữa - */
        headerLabel = new JLabel("", JLabel.CENTER);

        /*- Tạo thêm một nhẵn cố nội dung trống và được căn giữa -*/
        statusLabel = new JLabel("", JLabel.CENTER);

        /* - Đặt kích thước cho nhẵn - */
        statusLabel.setSize(350, 100);

        /* - Tạo một JPanel chứa các tp điều khiển - */
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 1));

        msglabel = new JLabel("Chao mung ban den voi VietTuts.Vn", JLabel.CENTER);

        mainFrame.add(headerLabel, BorderLayout.NORTH);
        mainFrame.add(controlPanel, BorderLayout.CENTER);
        mainFrame.add(statusLabel, BorderLayout.SOUTH);

        /*- Tắt trạng thái khung hình -*/
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* - Hiển thị khung hình - */
        mainFrame.setVisible(true);
    }

    private void ShowwJpanel() {
        headerLabel.setText("DEO BIET NOI NHU NAO");

        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);

        panel.setLayout(new FlowLayout());
        panel.add(msglabel);

        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        JPanell jpanel = new JPanell();
        jpanel.prepareGUI();

        jpanel.ShowwJpanel();
    }
}
