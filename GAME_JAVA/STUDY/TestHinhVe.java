import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Color;

public class TestHinhVe extends JFrame {

    private int rectX = 100;
    private int rectY = 100;

    private int ovalX = 300;
    private int ovalY = 100;

    public TestHinhVe() {
        setTitle("CHUONG TRINH TEST HINH VE");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel draw = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.RED);
                g.fillRect(rectX, rectY, 50, 30);

                g.setColor(Color.BLUE);
                g.fillOval(ovalX, ovalY, 50, 30);
            }
        };

        draw.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Không cần thiết lập
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Không cần thiết lập
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    rectX -= 10;
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    rectX += 10;
                } else if (keyCode == KeyEvent.VK_UP) {
                    rectY -= 10;
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    rectY += 10;
                }

                draw.repaint();
            }
        });

        draw.setFocusable(true);
        add(draw);

        setVisible(true);
        draw.requestFocusInWindow();
    }

    public static void main(String[] args) {
        new TestHinhVe();
    }
}
