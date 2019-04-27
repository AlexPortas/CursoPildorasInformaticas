package graficos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PruebaJSpinnerModel {
    public static void main(String[]args){
        MarcoJSpinner2 marco= new MarcoJSpinner2();
    }
}

class MarcoJSpinner2 extends JFrame{
    public MarcoJSpinner2() {
        setTitle("Prueba JSpinner");
        setBounds(500, 300, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new LaminaJSpinner2());
        
        setVisible(true);
    }
}

class LaminaJSpinner2 extends JPanel {
    private JLabel texto;
    private JSpinner control;

    public LaminaJSpinner2() {
        setLayout(new BorderLayout());
        
        
        control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            @Override
            public Object getNextValue(){
                return super.getPreviousValue();
            }

            public Object getPreviousValue(){
                return super.getNextValue(); 
            }
        });
        control.setPreferredSize(new Dimension(100,20));
        
        add(control);
    }
    
    /*private class MiModelo extends SpinnerNumberModel{
        public MiModelo(){
            super(5,0,10,1);
        }
        @Override
        public Object getNextValue(){
            return super.getPreviousValue();
        }
        
        public Object getPreviousValue(){
            return super.getNextValue(); 
        }
    }*/
}


