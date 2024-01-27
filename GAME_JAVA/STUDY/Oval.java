import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Color;

public class Oval {
    private JFrame jframe;

    /*- Ban đầu của cái Oval - */
    private int OvalX = 100;
    private int OvalY = 100;

    public Oval(){
        jframe  =new JFrame();

        jframe.setTitle("CHUNG LA CHO");
        jframe.setSize(700,450);

        jframe.setLocationRelativeTo(null);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel draw = new JPanel(){
            @Override 
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(OvalX, OvalY, 50, 30);
                
            }
        };

        draw.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                OvalX = e.getX() - 25;

                OvalY =e.getY() - 15;
                draw.repaint();
            }
        });

        jframe.add(draw);

        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        new Oval();
    }

    

}
