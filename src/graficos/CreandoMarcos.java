package graficos;

import javax.swing.*;

public class CreandoMarcos {
    public static void main(String[]args){
        miMarco marco1=new miMarco();
    }
}
class miMarco extends JFrame{

    public miMarco() {
        setSize(800,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500, 300);
        setTitle("Aqui estamos");
   }
    
}
