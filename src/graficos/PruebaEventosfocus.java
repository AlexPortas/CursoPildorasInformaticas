package graficos;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventosfocus {
    public static void main(String[]args){
        MarcoVentanaFoco marco1=new MarcoVentanaFoco();
    }
}

class MarcoVentanaFoco extends JFrame{

    public MarcoVentanaFoco() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 350);
        setTitle("Respondiendo");
        add(new LaminaFoco());
   }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        setLayout(null);
        cuadro1=new JTextField();
        cuadro2=new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
    OyenteFoco oyente_ventana=new OyenteFoco();
    cuadro1.addFocusListener(oyente_ventana);
    }
    JTextField cuadro1;
    JTextField cuadro2;
    
    private class OyenteFoco implements FocusListener{
        public void focusGained(FocusEvent e) {
            // Cuando coja el foco
        }
        public void focusLost(FocusEvent e) {
            String email=cuadro1.getText();
            boolean comprobacion=false;
            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i)=='@'){
                    comprobacion=true;
                }
            }
            if(comprobacion){
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
        }

    }
}

