import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel{

    private final int panelHeight = 420;
    private final int panelWithd = 420;
    private Timer timer ;
    private boolean isRunning = false;
    private int score;
    private int posXVaisseau = 200;
    private int posYMonster;
    private int vitesseXVaisseau;
    private int vitesseYMonster;
    private int vitesseYtir;
    private int heightTir;
    private int widthTir;
    private ImageIcon imageVaisseau;
    
    
    private Vaisseau player = new Vaisseau(40, 40, 4);
    private Monstre alien1 = new Monstre(20, 20, 1);
    
    
    
    Panel(){
        
        this.setSize(new Dimension(panelWithd, panelHeight));
        this.setBackground(Color.BLACK);
        timer = new Timer(1000, null);
        Start();
        
        

    

    }

   

    public void Start(){
        try {
            
            for(int i =0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(""+i);
            }
             
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
       
        
    }

    public void kill(){

    }



    public void score(){
/*va te faire enculer */

        
    }

    public void gameOver(){


       
    }


@Override
protected void paintComponent(Graphics g) {
    
         super.paintComponent(g);
         Graphics2D g2D = (Graphics2D) g;
         
         g2D.setColor(Color.CYAN);
        
        g2D.fillRect(posXVaisseau, 300, player.getWidth(), player.getHeight());

          g2D.setColor(Color.red);
        
        g2D.fillRect(100, posYMonster+20, alien1.getWidth(), alien1.getHeight());
        g2D.fillRect(200, posYMonster+20, alien1.getWidth(), alien1.getHeight());
        g2D.fillRect(300, posYMonster+20, alien1.getWidth(), alien1.getHeight());

}

     
    public void draw(Graphics g){
         
        

    }
    

    public void attack(){


    }

     public int getPosXVaisseau() {
        return posXVaisseau;
    }

    public int getPosYMonster() {
        return posYMonster;
    }
    public int getVitesseXVaisseau() {
        return vitesseXVaisseau;
    }
    public int getVitesseYMonster() {
        return vitesseYMonster;
    }
    public int getVitesseYtir() {
        return vitesseYtir;
    }

    public void setPosXVaisseau(int posXVaisseau) {
        this.posXVaisseau = posXVaisseau;
    }
    public void setPosYMonster(int posYMonster) {
        this.posYMonster = posYMonster;
    }
    public void setVitesseXVaisseau(int vitesseXVaisseau) {
        this.vitesseXVaisseau = vitesseXVaisseau;
    }
    public void setVitesseYMonster(int vitesseYMonster) {
        this.vitesseYMonster = vitesseYMonster;
    }
    public void setVitesseYtir(int vitesseYtir) {
        this.vitesseYtir = vitesseYtir;
    }


    
}