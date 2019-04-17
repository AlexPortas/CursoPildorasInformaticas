
package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaCheckBox {
    public static void main(String[]args){
        MarcoCheckBox marco= new MarcoCheckBox();
    }
}

class MarcoCheckBox extends JFrame{
    private JLabel texto;
    private JCheckBox cbNegrita, cbCursiva;
    private JPanel laminaChecks;
    
    public MarcoCheckBox() {
        setTitle("Prueba CheckBox");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Font letra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la Mancha...");
        texto.setFont(letra);
        add(texto, BorderLayout.CENTER);
        cbNegrita = new JCheckBox("Negrita");
        cbCursiva = new JCheckBox("Cursiva");
        laminaChecks = new JPanel();
        cbNegrita.addActionListener(new ManejaChecks());
        laminaChecks.add(cbNegrita);
        cbCursiva.addActionListener(new ManejaChecks());
        laminaChecks.add(cbCursiva);
        add(laminaChecks, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    private class ManejaChecks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int tipo = 0;
            if (cbNegrita.isSelected()) tipo+= Font.BOLD;
            if (cbCursiva.isSelected()) tipo+= Font.ITALIC;
                
            texto.setFont( new Font("Serif", tipo, 24 ));
                
        }
        
    }
}


