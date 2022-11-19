package expendedor2d;
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
//
public class Ventana extends JFrame implements ActionListener {
    JButton BT100;      
    JButton BT500;
    JButton BT1000;
    JButton BT1500;
    JButton BTnull;
    JButton BTcoca;
    JButton BTsprite;
    JButton BTfanta;
    String tet;
    PanelCentro pc;
    int BB;
    boolean CS;         private final JFXPanel TT = new JFXPanel(); JPanel pantalla;              
    public Ventana(){
                                          // TT= new JFXPanel(); //en final poner
                                          
        
        BB = 1;     BBTLOAD();  CS=false;
          //NO QUIERO LAYOUT >:( que me desordene todo
        this.setSize(1000,600);
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        
        pc = new PanelCentro();       
        this.add(pc);   //quite el BorderLayout en segundo parametro       
        setLocationRelativeTo(null);
        this.setVisible(true);           
        
        tet = "";
        
        BT100 = new JButton();
        BT500 = new JButton();
        BT1000 = new JButton();
        BT1500 = new JButton();
        BTnull = new JButton();
        BTcoca = new JButton();
        BTsprite = new JButton();
        BTfanta = new JButton();
        
        BT100.setBounds(540,0,115,115);
        BT500.setBounds(640,0,115,115);
        BT1000.setBounds(746,0,115,115);
        BT1500.setBounds(850,0,115,115);
        BTnull.setLayout(new BorderLayout());
        BTcoca.setBounds(266,475,239,115);
        BTsprite.setBounds(508,475,239,115);
        BTfanta.setBounds(750,475,239,115);
        //BT100.setRolloverIcon("icono");
        
        
        add(BT100);
        add(BT500);
        add(BT1000);     //Luego hacerles setContentAreaFill(false) a cada uno
        add(BT1500);
        add(BTcoca);
        add(BTsprite);
        add(BTfanta);
        add(BTnull);
        
        BT100.addActionListener(this);
        BT500.addActionListener(this);
        BT1000.addActionListener(this);
        BT1500.addActionListener(this);
        BTnull.addActionListener(this);
        BTcoca.addActionListener(this);
        BTsprite.addActionListener(this);
        BTfanta.addActionListener(this);
        
        BT100.setContentAreaFilled(false);
        BT500.setContentAreaFilled(false);
        BT1000.setContentAreaFilled(false);
        BT1500.setContentAreaFilled(false);
        BTnull.setContentAreaFilled(false);
        BTcoca.setContentAreaFilled(false);
        BTsprite.setContentAreaFilled(false);
        BTfanta.setContentAreaFilled(false);
        
        Delay(1000);
        
        
        
        
        
        
                
                
      
        
                //JFXPanel TT = new JFXPanel();
              /*  
                pantalla = new JPanel();
                pantalla.setBounds(200,200,500,500);
                add(pantalla); //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
                pantalla.setVisible(true);
                File file = new File("C:\\Users\\eparr\\Desktop\\fantav2.mp4");
                MediaPlayer oracleVid = new MediaPlayer(
                new Media( file.toURI().toString() )    );
                
                MediaView ptll = new MediaView(oracleVid);
                ptll.setMediaPlayer(oracleVid);//oracleVid.setCycleCount (MediaPlayer.INDEFINITE); //Repetir el video
                TT.setScene(new Scene(new Group(ptll ) )      );
                pantalla.add(TT);//oracleVid.setVolume(0.7);
                pc.add(pantalla);//pc le da mas claridad y no sobre ridea pc.add(pantalla);   //funciono pc.
                oracleVid.play();
       */

       
       
       
       
       
       
       
       
       
       
       
    }
    
    public  void actionPerformed(ActionEvent e){
        
      
        if(e.getSource() == BT100){        //block button
            System.out.println("funcionafeliz"); 
            pc.MainCoin = new Moneda100(0,0); BB = 0; pc.BB = 0; repaint();
        }
        
         if(e.getSource() == BT500){
            System.out.println("bacan");
            pc.MainCoin = new Moneda500(0,0); BB = 0; pc.BB = 0; repaint();
        }
        
         if(e.getSource() == BT1000){
            System.out.println("putin");
            pc.MainCoin = new Moneda1000(0,0); BB = 0; pc.BB = 0; repaint();
        }
    
         if(e.getSource() == BT1500){
            System.out.println("obama");   
            pc.MainCoin = new Moneda1500(0,0); BB = 0; pc.BB = 0; repaint();
        }  
         
         if(e.getSource() == BTnull){
             System.out.println("fuera de lugar"); 
        }
        
         if(BB == 0){   //Button Block
         if(e.getSource() == BTcoca){
             System.out.println("coca"); 
             pc.SodaCode = 1; pc.invitarComprador(); repaint(); CLINT();
        }
         
         if(e.getSource() == BTsprite){
             System.out.println("sprite");
             pc.SodaCode = 2; pc.invitarComprador(); repaint(); CLINT();
        }
         
         if(e.getSource() == BTfanta){
             System.out.println("fanta");
             pc.SodaCode = 3; pc.invitarComprador(); repaint()
                     ; CLINT();  createScene();
// createScene(); ;;;;;; 
        }
         }
         
    }
    
    

//<editor-fold>

    public void createScene(){
       // Platform.runLater(new Runnable(){
          //   @Override  
           // public void run(){
            
                pantalla = new JPanel();
                pantalla.setBounds(200,200,500,500);
                add(pantalla); //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
                pantalla.setVisible(true);
                File file = new File("C:\\Users\\eparr\\Desktop\\fantav2.mp4");
                MediaPlayer oracleVid = new MediaPlayer(
                new Media( file.toURI().toString() )    );
                
                MediaView ptll = new MediaView(oracleVid);
                ptll.setMediaPlayer(oracleVid);//oracleVid.setCycleCount (MediaPlayer.INDEFINITE); //Repetir el video
                TT.setScene(new Scene(new Group(ptll ) )      );
                pantalla.add(TT);//oracleVid.setVolume(0.7);
                pc.add(pantalla);   // sospecho que este no se puede llamar a cada rato //pc le da mas claridad y no sobre ridea pc.add(pantalla);   //funciono pc.
                oracleVid.play();
             
                //que hice
            //}   
       // }         //Ver que Elimine sus punteros luego
        //);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //</editor-fold>
    

String pon;
    Media son;
    MediaPlayer check;
    private void BBTLOAD(){
    
    JFXPanel bac = new JFXPanel();
      
        pon = new File("C:\\Users\\eparr\\Desktop\\compraf.wav").toURI().toString();
        son = new Media(pon);
        
                
        check = new MediaPlayer( son );
    
    
    }

    private void CLINT(){
        try{check.play();}
        catch(Exception er){}
        
        check = new MediaPlayer(son);
        
        
    }


public static void Delay(long millis){
        long ini = System.currentTimeMillis();
        while(System.currentTimeMillis() - ini < millis){
            
        }
        
        
    }

    

}
