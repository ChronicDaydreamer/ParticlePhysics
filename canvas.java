import java.awt.*;
import java.util.ArrayList;
class Canvas extends java.awt.Canvas{
    private ArrayList<Particle> particles = new ArrayList<>();
    private int width=500;
    private int height=500;
    private Graphics buffG;

    @Override
    public void paint(Graphics g) {
        this.buffG.setColor(Color.BLACK);
        this.buffG.fillRect(0, 0, width, height);
    }

}



