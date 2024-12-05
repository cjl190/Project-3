import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class DrawingPad {

    private JFrame frame;
    private Canvas canvas;
    private JPanel panel;
    private Graphics graphics;
    public DrawingPad(int height, int width) {
        frame = new JFrame("Drawing Pad");
        canvas = new Canvas();
        canvas.setSize(width, height);
        canvas.setBackground(Color.WHITE);
        panel = new JPanel();
        panel.add(canvas);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public Graphics getGraphicsContext(){
        if(graphics != null){ //return stored graphic is already set
            return graphics;
        }

        graphics = canvas.getGraphics();
        if(graphics != null){ //if the canvas isn't ready, check if graphics is null then set to black
            graphics.setColor(Color.BLACK);
        }
        return graphics;
    }

    public void draw(Polygon polygon){ //draws the polygon onto the canvas
        Graphics g = getGraphicsContext();
        if(g != null){
            g.setColor(Color.BLACK);
            Line[] lines = polygon.getLines();
            for(Line line : lines){
                g.drawLine((int)line.getFirstPoint().getX(), (int)line.getFirstPoint().getY(), (int)line.getSecondPoint().getX(), (int)line.getSecondPoint().getY());
            }
        }

    }

    public void erase(){ //erase everything else on the canvas
        Graphics g = getGraphicsContext();
        if(g != null){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            g.setColor(Color.BLACK);
        }
    }
}
