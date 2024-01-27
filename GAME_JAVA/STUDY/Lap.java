import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Lap extends JFrame {
    private int x1 = 50;
    private int y1 = 50;

    private int x2 = 600;
    private int y2 = 50;

    public Lap() {
        this.setTitle("TEST VONG LAP");
        this.setSize(700, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        };
        this.add(drawPanel);

        new Thread(() -> {
            while (true) {
                move();
                drawPanel.repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void move() {
        x1 += 5;
        x2 -= 5;

        if (x1 > getWidth()) {
            x1 = 0;
        }

        if (x2 < 0) {
            x2 = getWidth();
        }
    }

    private void draw(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x1, y1, 50, 30);

        g.setColor(Color.green);
        g.fillRect(x2, y2, 50, 30);
    }

    public static void main(String[] args) {
        Lap tmp = new Lap();
        tmp.setVisible(true);
    }
}
