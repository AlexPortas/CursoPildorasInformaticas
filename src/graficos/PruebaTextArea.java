
package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PruebaTextArea {
    public static void main(String[]args){
        MarcoTextArea marco= new MarcoTextArea();
    }
}

class MarcoTextArea extends JFrame{
    private JTextArea campo1;
    private JButton btnInsertar, btnSaltoLinea;
    private JPanel laminaBotones;
    
    public MarcoTextArea() {
        setTitle("Prueba area de texto");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        laminaBotones= new JPanel();
        btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                campo1.append("En un lugar de la mancha...");
            }
        });
        laminaBotones.add(btnInsertar);
        btnSaltoLinea = new JButton("Salto línea");
        btnSaltoLinea.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                boolean saltar = !campo1.getLineWrap();
                campo1.setLineWrap(saltar);
                if(saltar){
                    btnSaltoLinea.setText("Quitar salto");
                } else {
                    btnSaltoLinea.setText("Salto línea");
                }
            }
        });
        laminaBotones.add(btnSaltoLinea);
        add(laminaBotones, BorderLayout.SOUTH);
        
        campo1 = new JTextArea(8, 20);
        JScrollPane laminabarras = new JScrollPane(campo1);
        add(laminabarras, BorderLayout.CENTER);
        setVisible(true);
    }
}


