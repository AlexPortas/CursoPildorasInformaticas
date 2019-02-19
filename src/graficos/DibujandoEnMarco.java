
package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class DibujandoEnMarco {
    public static void main(String[]args){
        MarcoConDibus marco1=new MarcoConDibus();
    }
}

class MarcoConDibus extends JFrame{
    public MarcoConDibus(){
        setSize(800, 600);
        setLocation(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Prueba con dibujos");
        Lamina1 lamina=new Lamina1();
        add(lamina);
    }
}

class Lamina1 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawRect(50, 50, 100, 100);
//        g.drawOval(200, 200, 50, 50);
//        g.drawLine(500, 400, 50, 50);
        Graphics2D g2=(Graphics2D) g;
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150); 
        g2.draw(rectangulo);
        Ellipse2D elipse=new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100,100,300,250));
    }
}
