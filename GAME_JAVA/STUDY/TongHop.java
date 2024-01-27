import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TongHop {
    public static void main(String[] args) {
          JFrame jframe = new JFrame();

          jframe.setTitle("TEST TONG HOP");
          jframe.setSize(700,400);
        
             // Đặt JFrame ra giữa màn hình
          jframe.setLocationRelativeTo(null);
          jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          

                    JLabel label = new JLabel("HELLO QUOC CHUNG");
                    /*- Căn giữa đoạn nội dung -  */
                    label.setHorizontalAlignment(JLabel.CENTER);
                    
                    JButton button = new JButton("Click Me");
                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            label.setText("Button Clicked!");
                        }
                    });

          JPanel jPanel = new JPanel();
          jPanel.setLayout(new FlowLayout());

          jPanel.add(label);
          jPanel.add(button);

         
          jframe.add(jPanel);

          jframe.setVisible(true);


    }
  
    
}
