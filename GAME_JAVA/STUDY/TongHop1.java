import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.event.KeyEvent;

import java.awt.Graphics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TongHop1 {

    public static int rectX = 300, rectY = 300;
    public static int ovalX = 200, ovalY = 200;
    public static void main(String[] args) {
        /* - Khởi tạo khung hình - */
        JFrame jframe = new JFrame();
        jframe.setTitle("TEST TONG HOP");
        jframe.setSize(700, 450);
        jframe.setBackground(Color.ORANGE);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);

        /* - Vẽ hình chữ nhật - */

        JPanel jpanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.GREEN);
                g.fillRect(rectX, rectY, 50, 30);

                g.setColor(Color.RED);
                g.fillOval(ovalX, ovalY, 50, 30);
                ;
            }
        };
        // Set focusable to true and request focus
        jpanel.setFocusable(true);
        jpanel.requestFocus();

        /*- THêm sự kiện cho cái nút -  */
        jpanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W:
                        rectY += -5;
                        break;
                    case KeyEvent.VK_A:
                        rectX += -5;
                        break;
                    case KeyEvent.VK_S:
                        rectY += 5;
                        break;

                    case KeyEvent.VK_F:
                        rectX += 5;
                        break;
                }
                jpanel.repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        jpanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ovalX = e.getX() - 25;

                ovalY = e.getY() - 15;
                jpanel.repaint();
            }
        });

        jframe.add(jpanel);
        jframe.setVisible(true);
    }

}