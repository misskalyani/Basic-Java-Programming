import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CarAnimation extends Applet implements Runnable {
    private int x = 0;
    private int y = 150;
    private int speed = 5;
    private boolean isMoving = true;

    public void init() {
        setBackground(Color.WHITE);
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        isMoving = false;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 200, getWidth(), 50); // Road
        g.setColor(Color.WHITE);
        int lineY = 225;
        for (int i = 0; i < getWidth(); i += 50) {
            g.fillRect(i, lineY, 30, 5); // Dashed lines
        }
        g.setColor(Color.RED);
        g.fillRect(x, y, 100, 50); // Car body
        g.setColor(Color.PURPLE);
        g.fillRect(x + 10, y - 40, 80, 50); // Car roof
        g.setColor(Color.BLUE);
        g.fillOval(x + 10, y + 40, 30, 30); // Left wheel
        g.fillOval(x + 60, y + 40, 30, 30); // Right wheel
    }

    public void run() {
        while (isMoving) {
            x += speed;
            if (x > getWidth()) {
                x = -100; // Reset the car's position
            }
            repaint();
            try {
                Thread.sleep(50); /* Sleep for smooth animation */
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
            