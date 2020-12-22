package graficos;

import com.sun.glass.events.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto2 {
    public static void main(String[]args){
        MarcoProText2 marco= new MarcoProText2();
    }
}

class MarcoProText2 extends JFrame{
    public MarcoProText2() {
        setTitle("Procesaddor de texto");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaProText2());
        
        setVisible(true);
    }
}

class LaminaProText2 extends JPanel {
    JTextPane textarea;
    JMenu fuente, estilo, tamanho;
    Font letras;
    JToolBar barraEmer;
    
    public LaminaProText2() {
        setLayout(new BorderLayout());
        JMenuBar barra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanho = new JMenu("Tamaño");
        configurarMenu("Arial", "fuente", "Arial", 9, 10, "");
        configurarMenu("Courier", "fuente", "Courier", 9, 10, "");
        configurarMenu("Verdana", "fuente", "Verdana", 9, 10, "");
// ***************************************************
        configurarMenu("Negrita", "estilo", "", Font.BOLD, 1, "build/classes/graficos/img/cortar.png");
        configurarMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "build/classes/graficos/img/cortar.png");
        /*JCheckBoxMenuItem neg = new JCheckBoxMenuItem("Negrita", new ImageIcon("build/classes/graficos/img/cortar.png"));
        neg.addActionListener(new StyledEditorKit.BoldAction());
        estilo.add(neg);
        JCheckBoxMenuItem cur = new JCheckBoxMenuItem("Cursiva", new ImageIcon("build/classes/graficos/img/cortar.png"));
        cur.addActionListener(new StyledEditorKit.ItalicAction());
        estilo.add(cur);*/
//-***************************************************
        //configurarMenu("12", "tamanho", "", 1, 12, "");
        //configurarMenu("24", "tamanho", "", 1, 24, "");
        //configurarMenu("36", "tamanho", "", 1, 36, "");
        ButtonGroup tamamhos_fuente = new ButtonGroup();
        JRadioButtonMenuItem peque = new JRadioButtonMenuItem("12");
        tamamhos_fuente.add(peque);
        peque.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 12));
        JRadioButtonMenuItem mediano = new JRadioButtonMenuItem("24");
        tamamhos_fuente.add(mediano);
        mediano.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 24));
        JRadioButtonMenuItem grande = new JRadioButtonMenuItem("36");
        tamamhos_fuente.add(grande);
        grande.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", 36));
        tamanho.add(peque);
        tamanho.add(mediano);
        tamanho.add(grande);
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamanho);
        JPanel panelmenu = new JPanel();
        panelmenu.add(barra);
        add(panelmenu, BorderLayout.NORTH);
        textarea = new JTextPane();
        add(textarea, BorderLayout.CENTER);
        JPopupMenu menu = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Negrita");
        opcion1.addActionListener(new StyledEditorKit.BoldAction());
        menu.add(opcion1);
        JMenuItem opcion2 = new JMenuItem("Cursiva");
        opcion2.addActionListener(new StyledEditorKit.ItalicAction());
        menu.add(opcion2);
        textarea.setComponentPopupMenu(menu);
        
        barraEmer = new JToolBar();
        configurarBarra("build/classes/graficos/img/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
        barraEmer.addSeparator();
        configurarBarra("build/classes/graficos/img/cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
        configurarBarra("build/classes/graficos/img/subra.png").addActionListener(new StyledEditorKit.UnderlineAction());
        barraEmer.setOrientation(1);
        add(barraEmer, BorderLayout.WEST);
    }
    public JButton configurarBarra(String ruta){
        JButton boton = new JButton(new ImageIcon(ruta));
        barraEmer.add(boton);
        return boton;
    }
    
    public void configurarMenu(String rotulo, String menu, String letra, int par_estilo, int par_tamanho, String rutaImg){
        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(rutaImg));
        if (menu=="fuente"){
            fuente.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia tipo letra", letra));
        }else if (menu=="estilo"){
            estilo.add(elem_menu);
            if (par_estilo==1){
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
            } else if (par_estilo==2){
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }
        }/*else{
            tamanho.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", par_tamanho));
        }*/
    }
}


