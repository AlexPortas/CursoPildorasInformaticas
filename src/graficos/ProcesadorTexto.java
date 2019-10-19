package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaComboBox {
    public static void main(String[]args){
        MarcoComboBox marco= new MarcoComboBox();
    }
}

class MarcoComboBox extends JFrame{
    public MarcoComboBox() {
        setTitle("Prueba ComboBox");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaComboBox());
        
        setVisible(true);
    }
}

class LaminaComboBox extends JPanel {
    private JLabel texto;
    private JComboBox combo;

    public LaminaComboBox() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel lamina = new JPanel();
        combo = new JComboBox();
        combo.addItem("Serif");
        combo.addItem("SansSerif");
        combo.addItem("Monospaced");
        combo.addItem("Dialog");
        combo.addActionListener(new EventoCombo());
        lamina.add(combo);
        add(lamina, BorderLayout.NORTH);
    }
    private class EventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN, 18));
        }      
    }
}


