
package graficos;

import java.awt.*;
import javax.swing.*;

public class EscribiendoEnMarco {
    public static void main(String[]args){
        MarcoConTexto marco1=new MarcoConTexto();
    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto(){
        setSize(800, 600);
        setLocation(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Primer texto");
        Lamina lamina=new Lamina();
        add(lamina);
    }
}

class Lamina extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Aprendiendo Swing", 100, 100);
    }
}
