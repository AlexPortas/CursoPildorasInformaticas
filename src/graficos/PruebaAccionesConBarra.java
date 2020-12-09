package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.Action.NAME;
import static javax.swing.Action.SHORT_DESCRIPTION;
import static javax.swing.Action.SMALL_ICON;

public class PruebaAccionesConBarra {
    public static void main(String[]args){
        MarcoAccionConBarra marco=new MarcoAccionConBarra();
    }
}

class MarcoAccionConBarra extends JFrame{

    public MarcoAccionConBarra() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 500, 350);
        setTitle("Probando barrra");
        add(new JPanel());
        MarcoAccionConBarra.AccionColor accionAmarillo=new MarcoAccionConBarra.AccionColor("Amarillo", null, Color.yellow);
        MarcoAccionConBarra.AccionColor accionAzul=new MarcoAccionConBarra.AccionColor("Azul", null, Color.blue);
        MarcoAccionConBarra.AccionColor accionRojo=new MarcoAccionConBarra.AccionColor("Rojo", null, Color.red);
        JMenu menu = new JMenu("Color");
        menu.add(accionRojo);
        menu.add(accionAzul);
        menu.add(accionAmarillo);
        JMenuBar barra_menu = new JMenuBar();
        barra_menu.add(menu);
        setJMenuBar(barra_menu);
        JToolBar barra = new JToolBar();
        barra.add(accionRojo);
        barra.add(accionAmarillo);
        barra.add(accionAzul);
        add(barra, BorderLayout.NORTH);
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
