package LAYOUTT.HienThi;

import javax.swing.JFrame;

public class JFrameX extends JFrame {

    public JFrameX() {
        this.setTitle("TEST CUA TITI");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);

        JPanelll tmp = new JPanelll();

        this.add(tmp);
    }
}
