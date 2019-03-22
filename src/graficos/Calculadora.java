
package graficos;

import java.awt.*;
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
        setBounds(600, 350, 600, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaCalculadora lamina= new LaminaCalculadora();
        add(lamina, BorderLayout.NORTH);
    }
}


class LaminaCalculadora extends JPanel{
    private JPanel lamina2;
    
    public LaminaCalculadora() {
        setLayout(new BorderLayout());
        JButton pantalla=new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla,BorderLayout.NORTH);
        lamina2 =new JPanel();
        lamina2.setLayout(new GridLayout(4,4));
        /*JButton btn1 = new JButton("1");
        lamina2.add(btn1);
        JButton btn2 = new JButton("2");
        lamina2.add(btn2);
        JButton btn3 = new JButton("3");
        lamina2.add(btn3);
        JButton btn4 = new JButton("4");
        lamina2.add(btn4);
        JButton btn5 = new JButton("5");
        lamina2.add(btn5);
        JButton btn6 = new JButton("6");
        lamina2.add(btn6);
        JButton btn7 = new JButton("7");
        lamina2.add(btn7);
        JButton btn8 = new JButton("8");
        lamina2.add(btn8);
        JButton btn9 = new JButton("9");
        lamina2.add(btn9);
        JButton btn0 = new JButton("0");
        lamina2.add(btn0);
        JButton btnig = new JButton("=");
        lamina2.add(btnig);
        JButton btndiv = new JButton("/");
        lamina2.add(btndiv);
        JButton btnsum = new JButton("+");
        lamina2.add(btnsum);
        JButton btnres = new JButton("-");
        lamina2.add(btnres);
        JButton btnmul = new JButton("*");
        lamina2.add(btnmul);*/
        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("/");
        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");
        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("*");
        ponerBoton("0");
        ponerBoton(".");
        ponerBoton("=");
        ponerBoton("+");
        add(lamina2, BorderLayout.CENTER);
    }
    private void ponerBoton(String rotulo){
        JButton boton = new JButton(rotulo);
        lamina2.add(boton);
    }
}
