package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ProcesadorTexto {
    public static void main(String[]args){
        MarcoProText marco= new MarcoProText();
    }
}

class MarcoProText extends JFrame{
    public MarcoProText() {
        setTitle("Procesaddor de texto");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaProText());
        
        setVisible(true);
    }
}

class LaminaProText extends JPanel {
    private JTextPane textarea;
    JMenu fuente, estilo, tamanho;
    private Font letras;
    
    public LaminaProText() {
        setLayout(new BorderLayout());
        JMenuBar barra = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanho = new JMenu("Tamaño");
        configuraMenu("Arial", "fuente", "Arial", 9, 10);
        configuraMenu("Courier", "fuente", "Courier", 9, 10);
        configuraMenu("Verdana", "fuente", "Verdana", 9, 10);
        configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
        configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);
        configuraMenu("12", "tamanho", "", 1, 12);
        configuraMenu("24", "tamanho", "", 1, 24);
        configuraMenu("36", "tamanho", "", 1, 36);
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamanho);
        JPanel panelmenu = new JPanel();
        panelmenu.add(barra);
        add(panelmenu, BorderLayout.NORTH);
        textarea = new JTextPane();
        add(textarea, BorderLayout.CENTER);
    }
    
    public void configuraMenu(String rotulo, String menu, String letra, int par_estilo, int par_tamanho){
        JMenuItem elem_menu = new JMenuItem(rotulo);
        if (menu=="fuente"){
            fuente.add(elem_menu);
        }else if (menu=="estilo"){
            estilo.add(elem_menu);
        }else{
            tamanho.add(elem_menu);
        }
        elem_menu.addActionListener(new GestionaEventos(rotulo, letra, par_estilo, par_tamanho));
    }
     
    private class GestionaEventos implements ActionListener{
        String fuente_texto, menu;
        int estilo_texto, tamanho_texto;

        public GestionaEventos(String menu, String fuente_texto, int estilo_texto, int tamanho_texto) {
            this.fuente_texto = fuente_texto;
            this.menu = menu;
            this.estilo_texto = estilo_texto;
            this.tamanho_texto = tamanho_texto;
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            letras = textarea.getFont();
            if(menu=="Arial" || menu== "Verdana" || menu=="Courier"){
                estilo_texto = letras.getStyle();
                tamanho_texto = letras.getSize();
            }
            if(menu=="Cursiva" || menu== "Negrita"){
                fuente_texto = letras.getFontName();
                tamanho_texto = letras.getSize();
            }
            if(menu=="12" || menu== "24" || menu=="36"){
                fuente_texto = letras.getFontName();
                estilo_texto = letras.getStyle();
            }
            textarea.setFont(new Font(fuente_texto, estilo_texto, tamanho_texto));
        }
    }
}


