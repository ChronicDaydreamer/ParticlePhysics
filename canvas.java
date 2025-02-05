import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
class canvas extends JFrame implements MouseListener, MouseMotionListener, Runnable{
    Canvas c;
    Particle[] particles;
    canvas(){
        super("Canvas");
        
         this.c=new Canvas(){
            public void paint(Graphics g){

            }
        };
        Random r= new Random();
        this.particles= new Particle[10];
        for(int i =0;i<10;i++){
            particles[i]=new Particle(r.nextInt(0, 400),r.nextInt(0,300));
        }
        c.setBackground(Color.black);
 
        // add mouse listener
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
 
        add(c);
        setSize(400, 300);
        show();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = c.getGraphics();
 
        g.setColor(Color.red);
 
        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();
 
        // draw a Oval at the point 
        // where mouse is moved
        g.fillOval(x, y, 5, 5);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = c.getGraphics();
 
        g.setColor(Color.red);
 
        
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    

    @Override
    public void run() {
        Graphics g = c.getGraphics();
 
        
 
        // get X and y position
        // get X and y position
        for(int i =0;i<10000;i++){
            for(Particle particle:this.particles){
                // draw a Oval at the point where mouse is moved
                g.setColor(Color.red);
                System.out.println(particle.y);
                g.fillOval(particle.x, particle.y, 5, 5);
                particle.y+=1;
            }
        }
    }

    public static void main(String args[]){
        canvas c = new canvas();
        c.run();

    }
}



