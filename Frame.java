import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Frame extends JFrame implements KeyListener{

    private final int height = 420;
    private final int witdh= 420;
    Timer t = new Timer(1, null);
    private Panel p = new Panel();
    private int posYattack2=1;



    Frame(){

        this.setVisible(true);
        this.setSize(witdh, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.setResizable(false);
        this.setContentPane(p);

    }
   



    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
      
    }



    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           
            p.setPosXVaisseau(p.getPosXVaisseau()+5);
        
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            
            p.setPosXVaisseau(p.getPosXVaisseau()-5);
        
        }
        
        
        }

    



    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            
          p.setHeightTir(10);
          p.setWidthTir(5);
          p.setPosXAttack(p.getPosXVaisseau()+17);
          p.setPosYAttack(300);
          t.start();
                
                   
                }
                
        
        
            
                   
                
                    
                   
                
         
           
          }
    }

    

    

