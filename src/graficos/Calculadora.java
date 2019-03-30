
package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {
    public static void main(String[]args){
        MarcoCalculadora marco= new MarcoCalculadora();
    }
}

class MarcoCalculadora extends JFrame{
    public MarcoCalculadora() {
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaCalculadora lamina= new LaminaCalculadora();
        add(lamina, BorderLayout.NORTH);
        //pack();
    }
}


class LaminaCalculadora extends JPanel{
    private JPanel lamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOrden;
    
    public LaminaCalculadora() {
        principio=true;
        setLayout(new BorderLayout());
        pantalla=new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        lamina2 =new JPanel();
        ActionListener inserta = new InsertaNumero();
        ActionListener orden = new AccionOrden();
        lamina2.setLayout(new GridLayout(4,4));
        ponerBoton("7", inserta);
        ponerBoton("8", inserta);
        ponerBoton("9", inserta);
        ponerBoton("/", orden);
        ponerBoton("4", inserta);
        ponerBoton("5", inserta);
        ponerBoton("6", inserta);
        ponerBoton("*", orden);
        ponerBoton("1", inserta);
        ponerBoton("2", inserta);
        ponerBoton("3", inserta);
        ponerBoton("*", orden);
        ponerBoton("0", inserta);
        ponerBoton(".", inserta);
        ponerBoton("=", orden);
        ponerBoton("+", orden);
        add(lamina2, BorderLayout.CENTER);
    }
    
    private void ponerBoton(String rotulo, ActionListener oyente){
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        lamina2.add(boton);
    }
    
    private class InsertaNumero implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio){
                pantalla.setText(entrada);   
                principio = false;
            } else {
                pantalla.setText(pantalla.getText() + entrada);
            }
        }     
    }
    
    private class AccionOrden implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            principio = true;
            String simbolo = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOrden = simbolo;
        }
        
        public void calcular(double x){
            if(ultimaOrden.equals("+")){
                resultado+=x;
            } else if(ultimaOrden.equals("-")){
                resultado-=x;
            } else if(ultimaOrden.equals("*")){
                resultado*=x;
            } else if(ultimaOrden.equals("/")){
                resultado/=x;
            } else{
                resultado=x;
            }
            pantalla.setText("" + resultado);
        }
    }
}

