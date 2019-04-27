package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaJSlider {
    public static void main(String[]args){
        MarcoJSlider marco= new MarcoJSlider();
    }
}

class MarcoJSlider extends JFrame{
    public MarcoJSlider() {
        setTitle("Prueba JSlider");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaJSlider());
        
        setVisible(true);
    }
}

class LaminaJSlider extends JPanel {
    private JLabel texto;
    private JSlider slider;

    public LaminaJSlider() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha...");
        add(texto, BorderLayout.CENTER);
        JPanel lamina = new JPanel();
        
        slider = new JSlider(8,48,12);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Serif", Font.ITALIC, 10));
        
        slider.addChangeListener(new EventoSlider());
        lamina.add(slider);
        add(lamina, BorderLayout.NORTH);
    }
    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            texto.setFont(new Font("Serif", Font.PLAIN, slider.getValue()));
        }     
    }
}


