package expendedor2d;

import java.awt.*;
import javax.swing.JPanel;

public class Comprador extends JPanel {
    private int vuelto;
    private String sabor;                 //La rubrica decia ocupar solo 2 variables
    
    
    
    public Comprador(Moneda mo,int numbeb,Expendedor Exp) {
        vuelto = 0;
        Exp.comprarBebida(mo,numbeb);
                                    //Aqui ira el delay
        sacarYcontar(Exp);
        
        
        
                                                        //QUITE EL DEPOSITO DE BEBIDAS
                                                         //QUITE EL DEPOSITO DE VUELTO
    }
    public void paint(Graphics g){
        g.drawString("Vuelto:$"+vuelto,850,120);                            


                                           //OJO aqui agregar la imagen
    }
    
   
    
    public Moneda cualMoneda(){
        
                                           
                                   //Aqui poner el codigo moneda ELEC MONEDA
        return null;
    }
    
    public void sacarYcontar(Expendedor Exp){    //SACAR TODOS LOS MONEAS Y UNIFICARLO   
       Moneda mia = Exp.Cajamonedas.sacarMoneda();
       int total = 0;
       while(mia != null){ 
        total += 100;
        mia = Exp.Cajamonedas.sacarMoneda();    
    }
    
       vuelto = total;
       
    }
       
       
       
                                             //QUITE EL GUARDA BEBIDA
    
                                                 //QUITE GUARDA VUELTO    
    
    
    
   
    
    public String queBebiste(){
        return sabor;
    }
}
