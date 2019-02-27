package graficos;

import java.awt.Color;
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
        setBounds(600, 300, 500, 350);
        setTitle("Respondiendo");
        add(new LaminaAccion());
   }
}

class LaminaAccion extends JPanel{
    public LaminaAccion(){
        AccionColor accionAmarillo=new AccionColor("Amarillo", null, Color.yellow)
        AccionColor accionAzul=new AccionColor("Azul", null, Color.yellow)
        AccionColor accionRojo=new AccionColor("Rojo", null, Color.yellow)
        /*JButton botonAmarillo=new JButton("Amarillo");
        JButton botonAzul=new JButton("Azul");
        JButton botonRojo=new JButton("Rojo");
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);*/
    }
}

class AccionColor extends AbstractAction{

    public void actionPerformed(ActionEvent e) {
        
    }

    public AccionColor(String nombre, Icon icono, Color color) {
        putValue(NAME, nombre);
        putValue(SMALL_ICON, icono);
        putValue(SHORT_DESCRIPTION, "Poner la lámina de color "+nombre);
        putValue("color_de_fondo", color);
    }
    
} 