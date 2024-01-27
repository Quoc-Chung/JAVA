package LAYOUTT;
import javax.swing.*;
import java.awt.*;

public class Flow2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        JPanel panel = new JPanel();

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        flowLayout.setHgap(10);

        panel.setLayout(flowLayout);

        // Thêm các thành phần vào JPanel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
