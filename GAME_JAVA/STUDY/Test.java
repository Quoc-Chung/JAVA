import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        JPanel jpanel = new JPanel();

        JLabel nhan = new JLabel();
        nhan.setText("TO THICH CAU LAM DO");
        nhan.setBackground(Color.GREEN);
 
        jpanel.setSize(10,10);
        JButton bt = new JButton();
        bt.setSize(10, 10);
        bt.setBackground(Color.ORANGE);

        jpanel.setLayout(new GridLayout(3,3));
        jpanel.add(bt, BorderLayout.NORTH); // Đặt nút ở phía trên của JPanel

        jframe.setTitle("TEST VUI VE");
        jframe.setSize(700, 400);

        // Căn giữa JFrame
        jframe.setLocationRelativeTo(null);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setLayout(new BorderLayout());
        jframe.add(nhan, BorderLayout.NORTH);
        jframe.add(jpanel, BorderLayout.CENTER);

        jframe.setVisible(true);
    }
}
