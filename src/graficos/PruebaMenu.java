package graficos;

import javax.swing.*;

public class PruebaMenu {
    public static void main(String[]args){
        MarcoMenu marco= new MarcoMenu();
    }
}

class MarcoMenu extends JFrame{
    public MarcoMenu() {
        setTitle("Prueba menu");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaMenu());
        
        setVisible(true);
    }
}

class LaminaMenu extends JPanel {
    public LaminaMenu() {
        JMenuBar barra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu tools = new JMenu("Herramientas");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarcomo = new JMenuItem("Guardar como..");
        JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("build/classes/graficos/img/cortar.png"));
        JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("build/classes/graficos/img/copiar.png"));
        JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("build/classes/graficos/img/pegar.png"));
        JMenuItem preferencias = new JMenuItem("Preferencias");
        archivo.add(guardar);
        archivo.add(guardarcomo);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        tools.add(preferencias);
        barra.add(archivo);
        barra.add(edicion);
        barra.add(tools);
        add(barra);
    }
}


