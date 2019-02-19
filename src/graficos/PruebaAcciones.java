package graficos;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class PruebaAcciones {
    public static void main(String[]args){
        MarcoAccion marco=new MarcoAccion();
    }
}

class MarcoAccion extends JFrame{

    public MarcoAccion() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 350);
        setTitle("Respondiendo");
        add(new LaminaAccion());
   }
}

class LaminaAccion extends JPanel{
    public LaminaAccion(){
        JButton botonAmarillo=new JButton("Amarillo");
        JButton botonAzul=new JButton("Azul");
        JButton botonRojo=new JButton("Rojo");
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);
    }
}

