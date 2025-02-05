import java.awt.Color;
import java.awt.Graphics;
public class Particle {
    public int x;
    public int y;
    
    public Particle(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void draw(Graphics g){
        g.setColor(Color.red);
        System.out.println(this.y);
        g.fillOval(this.x, this.y, 5, 5);
    }
}
