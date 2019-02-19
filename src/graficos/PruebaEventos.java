package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaEventos {
    public static void main(String[]args){
        MarcoBotones marco1=new MarcoBotones();
    }
}

class MarcoBotones extends JFrame{

    public MarcoBotones() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 300, 500, 300);
        setTitle("Botones y eventos");
        LaminaBotones milamina= new LaminaBotones();
        add(milamina);
   }
    
    class LaminaBotones extends JPanel  {
        JButton botonAzul = new JButton("Azul");
        JButton botonAmarillo = new JButton("Amarillo");
        JButton botonRojo = new JButton("Rojo");
        
        public LaminaBotones(){
            add(botonAzul);
            add(botonAmarillo);
            add(botonRojo);
            ColorFondo Amarillo= new ColorFondo(Color.yellow);
            ColorFondo Azul= new ColorFondo(Color.blue);
            ColorFondo Rojo= new ColorFondo(Color.red);
            botonAzul.addActionListener(Azul);
            botonAmarillo.addActionListener(Amarillo);
            botonRojo.addActionListener(Rojo);
        }
        
        private class ColorFondo implements ActionListener{
            private Color colorFondo;
            
            public ColorFondo (Color c){
                colorFondo=c;
            }
 
            public void actionPerformed(ActionEvent e) {
                setBackground(colorFondo);
            }
        }
    }
}
