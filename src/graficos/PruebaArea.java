
package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaArea {
    public static void main(String[]args){
        MarcoArea marco= new MarcoArea();
    }
}

class MarcoArea extends JFrame{
    public MarcoArea() {
        setTitle("Prueba area de texto");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new LaminaArea());
        setVisible(true);
    }
}


class LaminaArea extends JPanel{
    private JTextArea campo1;
    private JLabel resultado;
    
    public LaminaArea() {
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        campo1 = new JTextArea(8, 20);
        campo1.setLineWrap(true);
        JScrollPane laminabarras = new JScrollPane(campo1);
        lamina2.add(laminabarras);
        add(resultado, BorderLayout.CENTER);
        JButton btn = new JButton("Pulsar");
        GestionaArea mievento = new GestionaArea();
        btn.addActionListener(mievento);
        lamina2.add(btn);
        add(lamina2, BorderLayout.NORTH);
    }

    private class GestionaArea implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resultado.setText(campo1.getText());                                
        }
    }
}

