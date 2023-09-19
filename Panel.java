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
    
    private Vaisseau player = new Vaisseau(15, 7, 4);
    private Monstre alien1 = new Monstre(10, 5, 1);
    
    
    
    Panel(){
        this.setSize(panelWithd, panelHeight);
        this.setBackground(Color.BLACK);




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
        //c'est moi 
    }

    
    
}
