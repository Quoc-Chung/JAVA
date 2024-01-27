package LAYOUTT.HienThi;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelll extends JPanel {
     public JPanelll() {
          // this.setBackground(Color.BLACK);
     }

     @Override
     protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.setColor(Color.PINK); // Đặt màu vẽ là màu hồng
          g.drawRect(100, 200, 200, 100);
     }
}
