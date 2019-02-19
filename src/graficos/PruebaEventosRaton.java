package graficos;

import java.awt.event.*;
import javax.swing.*;

public class PruebaEventosRaton {
    public static void main(String[]args){
        MarcoVentanaRaton marco1=new MarcoVentanaRaton();
    }
}

class MarcoVentanaRaton extends JFrame{

    public MarcoVentanaRaton() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 350);
        setTitle("Respondiendo");
        OyenteRaton oyente_ventana=new OyenteRaton();
        addMouseListener(oyente_ventana);
   }
}

class OyenteRaton extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has clicado. en X:" + e.getX() +", Y:" + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Has entrado en la ventana con el ratón.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Has salidodo en la ventana con el ratón");
    }

}
