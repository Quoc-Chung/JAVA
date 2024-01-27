import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HinhVe2 extends JFrame implements ActionListener {
    private JPanel draw;

    private Point ViTriOval;

    private Timer timer;
    public HinhVe2(){
        this.setTitle("TEST TIMER");
        this.setSize(700,400);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        /*- Không cho thay đổi kích thước cửa sổ - */
        this.setResizable(false);

         /* - Khởi tạo vị trí Oval - */
         ViTriOval = new Point(50,50);

        draw  = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                drawOval(g);
            }
        };

        this.add(draw);
       

        timer = new Timer(1000, this);
        timer.start(); 
    }
    private void drawOval(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(ViTriOval.x,ViTriOval.y, 50, 50);    
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int newX = (int) (Math.random()* (draw.getWidth() -50));
        int newY = (int) (Math.random()* (draw.getHeight() -50));

        ViTriOval.setLocation(newX, newY); 

        draw.repaint();
    }
    public static void main(String[] args) {
        HinhVe2 hv = new HinhVe2();
        hv.setVisible(true);
    }
}