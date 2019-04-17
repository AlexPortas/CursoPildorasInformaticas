package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaRadio {
    public static void main(String[]args){
        MarcoRadio marco= new MarcoRadio();
    }
}

class MarcoRadio extends JFrame{
    public MarcoRadio() {
        setTitle("Prueba RadioButton");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaRadio());
        
        setVisible(true);
    }
}

class LaminaRadio extends JPanel {
    private JLabel texto;
    private JRadioButton radio1, radio2, radio3, radio4;
    private ButtonGroup grupo;
    private JPanel lamina;

    public LaminaRadio() {
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        grupo = new ButtonGroup();
        lamina = new JPanel();
        colocarBotones("S", false, 10);
        colocarBotones("M", true, 12);
        colocarBotones("L", false, 18);
        colocarBotones("XL", false, 26);
        add(lamina, BorderLayout.SOUTH);
    }
    
    public void colocarBotones(String nombre, boolean seleccionado, final int tamanho){
        JRadioButton radio = new JRadioButton( nombre, seleccionado);
        grupo.add(radio);
        lamina.add(radio);
        ActionListener oyente = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamanho));
            }
        };
        radio.addActionListener(oyente);
    }
}


