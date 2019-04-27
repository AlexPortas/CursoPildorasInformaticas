package graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaJSpinner {
    public static void main(String[]args){
        MarcoJSpinner marco= new MarcoJSpinner();
    }
}

class MarcoJSpinner extends JFrame{
    public MarcoJSpinner() {
        setTitle("Prueba JSpinner");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaJSpinner());
        
        setVisible(true);
    }
}

class LaminaJSpinner extends JPanel {
    private JLabel texto;
    private JSpinner control;

    public LaminaJSpinner() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha...");
        add(texto, BorderLayout.CENTER);
        JPanel lamina = new JPanel();
        
        control = new JSpinner(new SpinnerNumberModel(12,8,50,2));
        control.setPreferredSize(new Dimension(100,20));
        
        control.addChangeListener(new EventoSpinner());
        lamina.add(control);
        add(lamina, BorderLayout.NORTH);
    }
    private class EventoSpinner implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            texto.setFont(new Font("Serif", Font.PLAIN, (int) control.getValue()));
        }     
    }
}


