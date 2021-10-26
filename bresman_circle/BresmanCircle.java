import javax.swing.*;
import java.awt.*;

public class BresmanCircle extends JFrame {

    JPanel panel;

    public BresmanCircle(){

        initPanel();
        initScreen();

    }

    void initPanel(){

        panel = new JPanel();
        add(panel); //Añado el panel al JFrame
        panel.setPreferredSize(new Dimension(800,600)); //Dimensiones del panel

    }

    private void initScreen(){

        setTitle("Bressman Circle");
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        //Para poder modificar más propiedades con Graphics 2d
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLUE);

        long bresenHamsStartTime = System.currentTimeMillis();
        drawBresenhamsCircle(100, this.getWidth(), this.getHeight(), g2d);
        long bresenHamsEndTime = System.currentTimeMillis();
        long bresenDelta = bresenHamsEndTime - bresenHamsStartTime;

    }



    public static void drawPoint(double x, double y,double width,double height, Graphics g) {
        double nativeX = getNativeX(x, width);
        double nativeY = getNativeY(y, height);
        g.fillRect((int)nativeX, (int)nativeY, 1, 1);
    }

    public static double getNativeX(double newX, double width) {
        return newX + (width/2);
    }

    public static double getNativeY(double newY, double height) {
        return (height/2) - newY;
    }

    public static void drawBresenhamsCircle(int r, double width, double height, Graphics g) {
        int x,y,d;
        y = r;
        x = 0;

        drawPoint(x, y, width, height,g);
        d = (3-2*(int)r);
        while (x <= y) {
            if (d <= 0) {
                d = d + (4*x + 6);
            } else {
                d = d + 4*(x-y) + 10;
                y--;
            }
            x++;

            drawPoint(x, y, width, height,g);

            drawPoint(-x, y, width, height,g);
            drawPoint(x, -y, width, height,g);

            drawPoint(-x, -y, width, height,g);
            drawPoint(y, x, width, height,g);
            drawPoint(-y, x, width, height,g);
            drawPoint(y, -x, width, height,g);

            drawPoint(-y, -x, width, height,g);
        }
    }

    public static void main(String[] args) {
       new BresmanCircle();
    }
}
