
package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaTexto {
    public static void main(String[]args){
        MarcoTexto marco= new MarcoTexto();
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto() {
        setTitle("Prueba texto");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaTexto lamina= new LaminaTexto();
        add(lamina);
        setVisible(true);
    }
}


class LaminaTexto extends JPanel{
    private JTextField campo1;
    private JLabel resultado;
    
    public LaminaTexto() {
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        JLabel texto1 = new JLabel("Email:");
        lamina2.add(texto1);
        campo1 = new JTextField(20);
        lamina2.add(campo1);
        add(resultado, BorderLayout.CENTER);
        JButton btn = new JButton("Comprobar");
        DameTexto mievento = new DameTexto();
        btn.addActionListener(mievento);
        lamina2.add(btn);
        add(lamina2, BorderLayout.NORTH);
    }

    private class DameTexto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto = 0;
            String email = campo1.getText();
            for (int i = 0; i < email.length(); i++) {
                if(email.charAt(i)=='@'){
                    correcto++;
                }
            }
            if(correcto!=1){
                resultado.setText("Email incorrecto");
            } else {
                resultado.setText("Email correcto");
            }
        }
    }
}

