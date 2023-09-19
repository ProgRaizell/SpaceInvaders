import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel{

    private final int panelHeight = 420;
    private final int panelWithd = 420;
    private Timer timer;
    private boolean isRunning = false;
    private int score;
    private int posXVaisseau;
    private int posYMonster;
    private int vitesseXVaisseau;
    private int vitesseYMonster;
    private int vitesseYtir;
    private int heightTir;
    private int widthTir;
    private ImageIcon imageVaisseau;
    

    
    
    
    Panel(){
        this.setSize(panelWithd, panelHeight);
        this.setBackground(Color.BLACK);
        this.setFocusable(true);//permet de prendre le focus sur la fenetre
        imageVaisseau = new ImageIcon("ship.png");
        
    


    }

    public void Start(){
        timer.start();
        
    }

    public void gameOver(){
        //      JOptionPane.showMessageDialog (null,"Game Over");
    }

    public void draw(Graphics g){
         Graphics2D g2D=((Graphics2D)g);
       g2D.drawRect(posXVaisseau, 400, WIDTH, HEIGHT);


    }

    public void attack(){


    }


    
}
