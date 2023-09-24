import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import javafx.scene.text.Font;

public class Panel extends JPanel implements ActionListener{

    private final int panelHeight = 420;
    private final int panelWithd = 420;
    private Timer timer ;
    private boolean isRunning = false;
    private int score;
    private int highScore;
    private int posXAttack;
    private int posYAttack;
    private int posYMonster =1;
    private int vitesseXVaisseau;
    private int vitesseYMonster=1;
    private int vitesseYtir;
    private int heightTir;
    private int widthTir;
    private ImageIcon image = new ImageIcon( "ship.png" );
   
    
    List<Monstre> Aliens = new ArrayList<Monstre>();  
    List<Shoot> Bullets = new ArrayList<Shoot>();  


    Vaisseau player = new Vaisseau(40, 40, 4, 200,300);
    
    
    Panel() {
         
        this.setSize(new Dimension(panelWithd, panelHeight));
        this.setBackground(Color.BLACK);
        timer = new Timer(1, this);
        
        kill();
		timer.start();
		
        Start();
        //score();
        Aliens.add(new Monstre(20, 20, 1, 100,50));        
        Aliens.add(new Monstre(20, 20, 1, 200,50));         
        Aliens.add(new Monstre(20, 20, 1, 300,50)); 
        Aliens.add(new Monstre(20, 20, 1, 150,50)); 
        Aliens.add(new Monstre(20, 20, 1, 250,50)); 


    

    }



   
public int getPosYAttack() {
    return posYAttack;
}

public void setPosYAttack(int posYAttack) {
    this.posYAttack = posYAttack;
}


   public int getWidthTir() {
       return widthTir;
   }
   public void setWidthTir(int widthTir) {
       this.widthTir = widthTir;
   }

   public int getHeightTir() {
       return heightTir;
   }
   public void setHeightTir(int heightTir) {
       this.heightTir = heightTir;
   }

    public void Start(){
        timer.start();
       
       
        
    }

    public void kill(){

        if(posYAttack == posYMonster +40 ) {
            System.out.println("kill");
        }

    }



    public void score(){

        while(posYAttack != posYMonster+40) {

        }
        System.out.println("touché");
    }

    public void highScore(){


    }

    public void gameOver(){


       
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
         if(posYMonster<600){
            try {
                Thread.sleep(0);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
                    posYMonster+=vitesseYMonster;
                    //posYAttack-=4;
                    for(int i = 0; i < Bullets.size();i++){
                        Bullets.get(i).update();
                    }
                }
            repaint();
    }
   
    

@Override
protected void paintComponent(Graphics g) {
    

         super.paintComponent(g);
         Graphics2D g2D = (Graphics2D) g;
         

         g2D.setColor(Color.CYAN);
        
        
        g2D.fillRect(player.getPosX(), player.getPosY(), player.getWidth(), player.getHeight());

          
 g2D.setColor(Color.GREEN);
        //g2D.fillRect(posXAttack, posYAttack, widthTir, heightTir);  

        for(int i =0; i<Bullets.size();i++){
            g2D.fillRect(Bullets.get(i).getPosX(), Bullets.get(i).getPosY(), Bullets.get(i).getWidth(), Bullets.get(i).getHeight());

        }
        g2D.setColor(Color.red);
        for(int i =0; i<Aliens.size();i++){
            g2D.fillRect(Aliens.get(i).getPosX(), Aliens.get(i).getPosY(), Aliens.get(i).getWidth(), Aliens.get(i).getHeight());

        }
        // g2D.fillRect(100, posYMonster+20, alien1.getWidth(), alien1.getHeight());
        // g2D.fillRect(200, posYMonster+20, alien1.getWidth(), alien1.getHeight());
        // g2D.fillRect(300, posYMonster+20, alien1.getWidth(), alien1.getHeight());

g2D.setColor(Color.WHITE);
g2D.drawString("Score : "+ score+"",250,20);

g2D.setColor(Color.WHITE);
g2D.drawString("High Sore :"+score+"",50,20);

}
public void setScore(int score) {
    this.score = score;
}

public int getScore() {
    return score;
}


public int getHighScore() {
    return highScore;
}

public void setHighScore(int highScore) {
    this.highScore = highScore;
}

public int getPosXAttack() {
    return posXAttack;
}
public void setPosXAttack(int posXAttack) {
    this.posXAttack = posXAttack;
}

     
    
    

    public void attack(){


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
/*if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("oui");
        } */
public void spacePressed(){
    Bullets.add(new Shoot(10,5,player.getPosX()+17,player.getPosY(),2));
}
    }

   
    

        
  
    

