
package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CreandoMarcoCentrado {
    public static void main(String[]args){
        miMarcoCen marco1=new miMarcoCen();
    }
}

class miMarcoCen extends JFrame{
    public miMarcoCen(){
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamanho=mipantalla.getScreenSize();
        int altura=tamanho.height;
        int ancho=tamanho.width;
        setSize(ancho/2, altura/2);
        setLocation(ancho/4, altura/4);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}