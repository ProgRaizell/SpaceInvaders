import javax.swing.JFrame;

public class Frame extends JFrame{

    private final int height = 420;
    private final int witdh= 420;
    private Panel p = new Panel();



    Frame(){

        this.setVisible(true);
        this.setSize(witdh, height);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setContentPane(p);

    }

    

    
}
