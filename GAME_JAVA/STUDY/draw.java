import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class draww extends JFrame {

  private JLabel label;
  private Image image;

  public draww() {
    super("Draw Image Example");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 300);
    setLocationRelativeTo(null);

    // Load an image from a file
    image = Toolkit.getDefaultToolkit().getImage("");

    // Create a custom label that overrides the paintComponent method
    label = new JLabel() {
      @Override
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image at the center of the label
        int x = (getWidth() - image.getWidth(null)) / 2;
        int y = (getHeight() - image.getHeight(null)) / 2;
        g.drawImage(image, x, y, null);
      }
    };

    // Add the label to the frame
    add(label);
  }

  public static void main(String[] args) {
    new draww().setVisible(true);
  }
}
