package graficos;

import java.awt.BorderLayout;
import javax.swing.*;

public class MenuEmergente2 {
    public static void main(String[]args){
        MarcoMenuEmer2 marco= new MarcoMenuEmer2();
    }
}

class MarcoMenuEmer2 extends JFrame{
    public MarcoMenuEmer2() {
        setTitle("Menu emergente");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaMenuEmer2());
        
        setVisible(true);
    }
}

class LaminaMenuEmer2 extends JPanel {
    JTextPane textarea;
    JMenu fuente, estilo, tamanho;
    
    public LaminaMenuEmer2() {
        setLayout(new BorderLayout());
        JMenuBar barra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanho = new JMenu("Tamaño");
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamanho);
        JPanel panelmenu = new JPanel();
        panelmenu.add(barra);
        add(panelmenu, BorderLayout.NORTH);
        textarea = new JTextPane();
        add(textarea, BorderLayout.CENTER);
        JPopupMenu menu = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        menu.add(opcion1);
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        menu.add(opcion2);
        JMenuItem opcion3 = new JMenuItem("Opcion 3");
        menu.add(opcion3);
        textarea.setComponentPopupMenu(menu);
    }
}