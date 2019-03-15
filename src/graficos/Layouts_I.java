
package graficos;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_I {
    public static void main(String[]args){
        Marco_Layout marco= new Marco_Layout();
    }

    private static class Marco_Layout extends JFrame{

        public Marco_Layout() {
            setTitle("Prueba Aciones");
            setBounds(600, 350, 600, 300);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Panel_Layout lamina= new Panel_Layout();
            FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
            lamina.setLayout(disposicion);
            add(lamina);
        }
    }

    private static class Panel_Layout extends JPanel{

        public Panel_Layout() {
            add(new JButton("Amarillo"));
            add(new JButton("Rojo"));
            add(new JButton("Azul"));
        }
    }
}
