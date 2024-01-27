import javax.swing.JFrame;

public class MyWindown extends JFrame {
    public MyWindown() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        this.setVisible(true);
    }

    public void display(String title) {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void display(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindown mw = new MyWindown();
        mw.display("CHUNG", 600, 400);
    }
}

