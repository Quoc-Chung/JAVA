import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NhieuCuaSo {
    public static void main(String[] args) {
        // Tạo và hiển thị cửa sổ 1
        JFrame frame1 = createAndShowFrame("Window 1");
        
        // Tạo và hiển thị cửa sổ 2
        JFrame frame2 = createAndShowFrame("Window 2");

        // Tạo và hiển thị cửa sổ 3
        JFrame frame3 = createAndShowFrame("Window 3");

        // Bắt đầu luồng đổi màu cho cửa sổ 1
        new ColorChangingThread(frame1).start();

        // Bắt đầu luồng đổi màu cho cửa sổ 2
        new ColorChangingThread(frame2).start();

        // Bắt đầu luồng đổi màu cho cửa sổ 3
        new ColorChangingThread(frame3).start();
    }

    private static JFrame createAndShowFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Đổi màu của cửa sổ khi nút được bấm
                frame.getContentPane().setBackground(getRandomColor());
            }
        });

        frame.add(button);
        frame.setVisible(true);

        return frame;
    }

    private static Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

    private static class ColorChangingThread extends Thread {
        private JFrame frame;

        public ColorChangingThread(JFrame frame) {
            this.frame = frame;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    // Ngủ một khoảng thời gian ngẫu nhiên
                    Thread.sleep((long) (Math.random() * 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Đổi màu của cửa sổ
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        frame.getContentPane().setBackground(getRandomColor());
                    }
                });
            }
        }
    }
}
