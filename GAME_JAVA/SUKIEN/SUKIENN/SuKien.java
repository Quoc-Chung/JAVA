package SUKIENN;
/* - Dùng để tạo cửa sổ - */
import javax.swing.JFrame;
import javax.swing.JPanel;
/* - Tạo nút bấm chơi -  */
import javax.swing.JButton;
import javax.swing.JTextArea;

public class SuKien extends JFrame{
    /* - Khai báo hai nút - */
    private JButton button;
    private JTextArea text;

    public SuKien(){
    /* - Khoi tao cac doi tuong -  */
      button = new JButton("CLICK ME");
      text = new JTextArea();
      
      this.addKeyListener(this);
      this.add
  
       


    }
    public static void main(String[] args) {
        new SuKien();
    }
}