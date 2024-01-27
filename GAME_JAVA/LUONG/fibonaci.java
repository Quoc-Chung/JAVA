import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fibonaci {
    public static void main(String[] args) {
        // Tạo vầ hiển thị cửa sổ 
        JFrame jframe = new JFrame();
        jframe.setTitle("TEST LUONG");
        jframe.setSize(500, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);

        JButton button = new JButton("Click Me");

         button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mô phỏng một công việc khi nút được bấm
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
        
        // Thực hiện tính toán dãy fibonaci lớn 
        calculateFibonacci();

        // Thực hiện một công việc khác trong luồng chính
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is still doing some work...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    jframe.add(button);
    jframe.setVisible(true);
    }




    private static void calculateFibonacci() {
        // Mô phỏng một công việc dài hạn (tính toán dãy Fibonacci lớn)
        int n = 40;
        long result = fib(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }

    private static long fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
