import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Point;


public class RanTest extends JFrame implements ActionListener {
    private int gridSize = 20;
    private int gridSizeX = 700 / gridSize;
    private int gridSizeY = 500 / gridSize;

    private int snakeLength = 1;
    private ArrayList<Point> snake = new ArrayList<>();

    private Point food = generateFood();

    private Timer timer;

    public RanTest() {
        setTitle("Snake Game");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        };
        drawPanel.setBackground(Color.BLACK);
        add(drawPanel);

        // Add MouseAdapter to drawPanel to request focus
        drawPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawPanel.requestFocus();
            }
        });

        // Add KeyAdapter to drawPanel
        drawPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }
        });

        setFocusable(true);
        setVisible(true);
        drawPanel.requestFocus();

        timer = new Timer(100, this); // Reduced the timer delay for smoother movement
        timer.start();

        // Initialize snake with a starting position
        int initialX = 100;
        int initialY = 100;
        snake.add(new Point(initialX, initialY));
    }

    private Point generateFood() {
        Random rand = new Random();
        Point newFood;
    
        do {
            int x = rand.nextInt(gridSizeX);
            int y = rand.nextInt(gridSizeY);
    
            // Tính toán vị trí mới sao cho nó nằm trong cửa sổ
            int foodX = x * gridSize;
            int foodY = y * gridSize;
    
            // Kiểm tra xem điểm mới có thuộc rắn hay không
            newFood = new Point(foodX, foodY);
        } while (snake.contains(newFood));
    
        return newFood;
    }
    private void draw(Graphics g) {
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x, p.y, gridSize, gridSize);
        }

        g.setColor(Color.RED);
        g.fillRect(food.x, food.y, gridSize, gridSize);
    }

    private void move() {
        Point head = snake.get(0);
        Point newHead = new Point(head.x, head.y);

        switch (direction) {
            case KeyEvent.VK_UP:
                newHead.y -= gridSize;
                break;
            case KeyEvent.VK_DOWN:
                newHead.y += gridSize;
                break;
            case KeyEvent.VK_LEFT:
                newHead.x -= gridSize;
                break;
            case KeyEvent.VK_RIGHT:
                newHead.x += gridSize;
                break;
        }

        // Check collision with walls
        if (newHead.x < 0) newHead.x = getWidth() - gridSize;
        if (newHead.x >= getWidth()) newHead.x = 0;
        if (newHead.y < 0) newHead.y = getHeight() - gridSize;
        if (newHead.y >= getHeight()) newHead.y = 0;

        // Check collision with self
        if (snake.contains(newHead)) {
            gameOver();
            return;
        }

        // Check if snake eats food
        if (newHead.equals(food)) {
            snakeLength++;
            food = generateFood();
        } else {
            // Remove tail if not eating
            snake.remove(snakeLength - 1);
        }

        // Add new head
        snake.add(0, newHead);
    }

    private void gameOver() {
        timer.stop();
        JOptionPane.showMessageDialog(this, "Game Over! Your score: " + (snakeLength - 1));
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }
    private int direction = KeyEvent.VK_RIGHT;

    private void handleKeyPress(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (direction != KeyEvent.VK_DOWN)
                    direction = KeyEvent.VK_UP;
                break;
            case KeyEvent.VK_DOWN:
                if (direction != KeyEvent.VK_UP)
                    direction = KeyEvent.VK_DOWN;
                break;
            case KeyEvent.VK_LEFT:
                if (direction != KeyEvent.VK_RIGHT)
                    direction = KeyEvent.VK_LEFT;
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != KeyEvent.VK_LEFT)
                    direction = KeyEvent.VK_RIGHT;
                break;
        }
    }

    public static void main(String[] args) {
        new RanTest();
    }
}
