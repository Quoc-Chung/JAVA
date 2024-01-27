import javax.swing.JFrame;
import java.awt.Color;

public class HaiLuong {
    public static void main(String[] args) {

        JFrame jframe = new JFrame();
        jframe.setTitle("TEST HAI LUONG");
        jframe.setSize(700,500);
        jframe.setBackground(Color.BLUE);
        jframe.setLocationRelativeTo(null);


        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);

        Thread thread1 = new Thread(() -> {
            for (int i=0;i<5;i++){
                System.out.println(i);
                try{
                  Thread.sleep((long)Math.random() *1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        );

        // Tạo luồng thứ hai và bắt đầu thực thi
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    // Ngủ một khoảng thời gian ngẫu nhiên để mô phỏng thời gian thực hiện công việc
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        /* - Bắt đầu thực hiện chương trình-  */
        thread1.start();
        thread2.start();
    }
}
/*
 - Trong ví dụ này, thread1 và thread2 là hai luồng độc lập 
 */
