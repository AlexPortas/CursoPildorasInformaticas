package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventosTeclado {
    public static void main(String[]args){
        MarcoVentan marco1=new MarcoVentan();
    }
}

class MarcoVentan extends JFrame{

    public MarcoVentan() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 350);
        setTitle("Respondiendo");
        Oyente oyente_ventana=new Oyente();
        addKeyListener(oyente_ventana);
   }
}

class Oyente implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        //int codigo = e.getKeyCode() // ------------- codigo de la tecla
         //char letra = e.getKeyChar() // -------------- letra pulsada
        System.out.println("La tecla ha sido pulsada.");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("La tecla ha sido soltada.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("La tecla ha sido pulsada y soltada.");
    }
}
