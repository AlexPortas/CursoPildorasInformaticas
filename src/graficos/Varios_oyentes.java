package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Varios_oyentes {
    public static void main(String[]args){
        Marco_Principal marco1=new Marco_Principal();
    }
}

class Marco_Principal extends JFrame{

    public Marco_Principal() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 300, 500, 300);
        setTitle("Varios oyentes");
        Lamina_Principal milamina= new Lamina_Principal();
        add(milamina);
   }
}

class Lamina_Principal extends JPanel {

    public Lamina_Principal() {
        JButton boton_nuevo = new JButton("Nuevo");
        add(boton_nuevo);
        boton_nuevo.addActionListener(new OyenteNuevo());
        boton_cerrar = new JButton("Cerrar todas");
        add(boton_cerrar);
    }
    JButton boton_cerrar;
    
    private class OyenteNuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new Marco_Energente(boton_cerrar);
        }
        
    }
}

class Marco_Energente extends JFrame{
    private static int contador;
    
    public Marco_Energente(JButton boton) {
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 300, 150);
        setVisible(true);
        boton.addActionListener(new CierraTodos());
    }
    private class CierraTodos implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            dispose();
        }
        
    }
}