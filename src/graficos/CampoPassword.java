
package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CampoPassword {
    public static void main(String[]args){
        MarcoPassword marco= new MarcoPassword();
    }
}

class MarcoPassword extends JFrame{
    public MarcoPassword() {
        setTitle("Password");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new LaminaPassword());
        setVisible(true);
    }
}


class LaminaPassword extends JPanel{
    private JPasswordField pwd;
    
    public LaminaPassword() {
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(2,2));
        add(lamina2, BorderLayout.NORTH);
        lamina2.add(new JLabel("Usuario:"));
        JTextField user = new JTextField(20);
        lamina2.add(user);
        lamina2.add(new JLabel("Contraseña:"));
        pwd = new JPasswordField(20);
        pwd.getDocument().addDocumentListener(new EscuchaPassword());
        lamina2.add(pwd);
        add(new JButton("Comprobar"), BorderLayout.SOUTH);
    }

    private class EscuchaPassword implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            char []contrasena;
            contrasena = pwd.getPassword();
            if (contrasena.length<8 || contrasena.length>12){
                pwd.setBackground(Color.red);
            } else {
                pwd.setBackground(Color.white);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char []contrasena;
            contrasena = pwd.getPassword();
            if (contrasena.length<8 || contrasena.length>12){
                pwd.setBackground(Color.red);
            } else {
                pwd.setBackground(Color.white);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
    }
}

