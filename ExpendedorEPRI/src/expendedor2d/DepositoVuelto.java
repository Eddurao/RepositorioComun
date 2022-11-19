package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoVuelto {
    private ArrayList <Moneda> ALvuelto;
    
    public DepositoVuelto(){
        
        ALvuelto = new ArrayList <>();
        
    }
    
    public void paint(Graphics g){
    }
    public void Devolucion(Moneda money){
        ALvuelto.add(money);
    }
    public void BotarMoneda(){     
         ALvuelto.add(new Moneda100(2,2));  //aqui setearemos moneas
    }
    
    public Moneda sacarMoneda(){
        if(ALvuelto.isEmpty()){
            return null;                              //SACAR MONEA
        }else{                                       
            return ALvuelto.remove(0);
        }
    }
    
    
    
    
    
    
   
}
