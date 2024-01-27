package SUKIEN;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BanPhim extends JFrame  implements ActionListener{
     JButton button;
     
     public BanPhim(){
        button = new JButton();
        button.addActionListener(this);


       // Đặt kích thước cho nút (ví dụ: 100x50)
        button.setSize(100, 50);
        this.add(button);
        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
     }
    @Override
     public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("NUT DA DUOC BAM ");
        }
     }
     public static void main(String[] args) {
        new BanPhim();
     }
}

