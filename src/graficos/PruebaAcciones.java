package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.Action.NAME;
import static javax.swing.Action.SHORT_DESCRIPTION;
import static javax.swing.Action.SMALL_ICON;

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
        LaminaAccion lamina = new LaminaAccion();
        add(lamina);
   }
}

class LaminaAccion extends JPanel{
    public LaminaAccion(){
        AccionColor accionAmarillo=new AccionColor("Amarillo", null, Color.yellow);
        AccionColor accionAzul=new AccionColor("Azul", null, Color.blue);
        AccionColor accionRojo=new AccionColor("Rojo", null, Color.red);
        add(new JButton(accionAmarillo));
        add(new JButton(accionAzul));
        add(new JButton(accionRojo));
        /*JButton botonAmarillo=new JButton("Amarillo");
        JButton botonAzul=new JButton("Azul");
        JButton botonRojo=new JButton("Rojo");
        add(botonAmarillo);
        add(botonAzul);
        add(botonRojo);*/
    }
 
    private class AccionColor extends AbstractAction{

        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color_de_fondo");
            setBackground(c);
        }

        public AccionColor(String nombre, Icon icono, Color color) {
            putValue(NAME, nombre);
            putValue(SMALL_ICON, icono);
            putValue(SHORT_DESCRIPTION, "Poner la lámina de color "+nombre);
            putValue("color_de_fondo", color);
        }
    } 
}
