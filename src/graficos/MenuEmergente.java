package graficos;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MenuEmergente {
    public static void main(String[]args){
        MarcoMenuEmer marco= new MarcoMenuEmer();
    }
}

class MarcoMenuEmer extends JFrame{
    public MarcoMenuEmer() {
        setTitle("Menu emergente");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaMenuEmer());
        
        setVisible(true);
    }
}

class LaminaMenuEmer extends JPanel {
    
    public LaminaMenuEmer() {
        JPopupMenu menu = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        menu.add(opcion1);
        JMenuItem opcion2 = new JMenuItem("Opcion 2");
        menu.add(opcion2);
        JMenuItem opcion3 = new JMenuItem("Opcion 3");
        menu.add(opcion3);
        setComponentPopupMenu(menu);
    }
}