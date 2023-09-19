import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

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

    


    }

    public void Start(){
        timer.start();
        
    }

    public void gameOver(){
        //      JOptionPane.showMessageDialog (null,"Game Over");
    }

    public void draw(Graphics g){
         Graphics2D graphics2D=((Graphics2D)g);

    }

    public void attack(){


    }

    
    
}
