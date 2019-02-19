package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventosVentana {
    public static void main(String[]args){
        MarcoVentana marco1=new MarcoVentana();
    }
}

class MarcoVentana extends JFrame{

    public MarcoVentana() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 350);
        setTitle("Respondiendo");
        M_Ventana oyente_ventana=new M_Ventana();
        addWindowListener(oyente_ventana);
   }
}

class M_Ventana implements WindowListener{

    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");        
    }
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");        
    }
    public void windowDeactivated(WindowEvent e) {    
        System.out.println("Ventana desactivada"); 
    }
}
