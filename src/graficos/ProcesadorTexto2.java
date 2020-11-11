package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
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
    
    public LaminaProText2() {
        setLayout(new BorderLayout());
        JMenuBar barra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanho = new JMenu("Tamaño");
        configurarMenu("Arial", "fuente", "Arial", 9, 10, "");
        configurarMenu("Courier", "fuente", "Courier", 9, 10, "");
        configurarMenu("Verdana", "fuente", "Verdana", 9, 10, "");
        configurarMenu("Negrita", "estilo", "", Font.BOLD, 1, "build/classes/graficos/img/cortar.png");
        configurarMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "build/classes/graficos/img/cortar.png");
        configurarMenu("12", "tamanho", "", 1, 12, "");
        configurarMenu("24", "tamanho", "", 1, 24, "");
        configurarMenu("36", "tamanho", "", 1, 36, "");
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamanho);
        JPanel panelmenu = new JPanel();
        panelmenu.add(barra);
        add(panelmenu, BorderLayout.NORTH);
        textarea = new JTextPane();
        add(textarea, BorderLayout.CENTER);
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
            } else if (par_estilo==2){
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            }
        }else{
            tamanho.add(elem_menu);
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia tamaño", par_tamanho));
        }
    }
}


