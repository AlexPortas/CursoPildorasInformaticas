package graficos;

import javax.swing.*;

public class PruebaRadioButton {
    public static void main(String[]args){
        MarcoRadioButton marco= new MarcoRadioButton();
    }
}

class MarcoRadioButton extends JFrame{
    public MarcoRadioButton() {
        setTitle("Prueba RadioButton");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LaminaRadioButton lamina = new LaminaRadioButton();
        add(lamina);
        
        setVisible(true);
    }
}

class LaminaRadioButton extends JPanel {

    public LaminaRadioButton() {
        ButtonGroup grupo = new ButtonGroup();
        ButtonGroup grupo2 = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("Azul", false);
        JRadioButton radio2 = new JRadioButton("Rojo", true);
        JRadioButton radio3 = new JRadioButton("Verde", false);
        JRadioButton radio4 = new JRadioButton("Femenino", false);
        JRadioButton radio5 = new JRadioButton("Masculino", false);
        grupo.add(radio1);
        grupo.add(radio2);
        grupo.add(radio3);
        grupo2.add(radio4);
        grupo2.add(radio5);
        add(radio1);
        add(radio2);
        add(radio3);
        add(radio4);
        add(radio5);
    }
}


