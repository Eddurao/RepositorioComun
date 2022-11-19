package expendedor2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Xbotones extends JPanel implements ActionListener{
   
    public int t;
    JButton boton1;
                   // VAMOS A QUITAR EL CLICK LISTENER Y PONEMOS UN ACTION LISTENER 
    public Xbotones(){
        
        
        boton1 = new JButton();
        boton1.setBounds(150,100,100,30);
        add(boton1);
        
                                               //QUITAMOS LOS RADIOBOTONES Y EL BOTON GROUP
       
    }   
    
    public void paint(Graphics g){
    super.paint(g);
    
    }
    
    
   @Override
   public void actionPerformed(ActionEvent evento){
       
       
   }
    
    
    
    public static void Delay(long millis){
        long ini = System.currentTimeMillis();
        while(System.currentTimeMillis() - ini < millis){
            
        }
        
        
    }
    
    
    
    
}

