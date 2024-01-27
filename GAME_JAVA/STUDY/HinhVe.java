import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HinhVe {
    public JFrame jframe;
    public JPanel draw;
    private int rectX = 100;
    private int rectY = 100;

    private int ovalX = 300;
    private int ovalY = 100;
    
    public HinhVe() {
        jframe = new JFrame();
        jframe.setTitle("CHUONG TRINH TEST HINH VE");
        jframe.setSize(500, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo một đối tượng jPanel để vẽ, phải kế thừa từ JPanel
        draw = new JPanel() {
                @Override
                public void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.RED);
                    g.fillRect(rectX, rectY, 50, 30);
        
                    g.setColor(Color.BLUE);
                    g.fillOval(ovalX, ovalY, 50, 30);;
                }
        };

        // Thêm key listener để di chuyển hình chữ nhật khi nhấn phím
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
                // Di chuyển hình chữ nhật khi phím mũi tên được nhấn
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

                // Yêu cầu vẽ lại JPanel
                draw.repaint();
            }
        });
        // Kích hoạt sự kiện cho JPanel
        draw.setFocusable(true);

        // Thêm JPanel vào JFrame
        jframe.add(draw);

        // Hiển thị JFrame
        jframe.setVisible(true);

        // Đảm bảo JFrame có focus
        draw.requestFocusInWindow();
    }
    public static void main(String[] args) {
       new HinhVe();
    }
}
