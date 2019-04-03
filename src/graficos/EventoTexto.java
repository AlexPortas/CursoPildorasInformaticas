
package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoTexto {
    public static void main(String[]args){
        MarcoEventoTexto marco= new MarcoEventoTexto();
    }
}

class MarcoEventoTexto extends JFrame{
    public MarcoEventoTexto() {
        setTitle("Prueba evento texto");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaEventoTexto lamina= new LaminaEventoTexto();
        add(lamina);
        setVisible(true);
    }
}


class LaminaEventoTexto extends JPanel{
    
    public LaminaEventoTexto() {
        JTextField campo1 = new JTextField(20);
        Document doc = campo1.getDocument();
        doc.addDocumentListener(new EscuchaTexto());
        add(campo1);
    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has introducido texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }
    }
}

