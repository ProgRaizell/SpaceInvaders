public class Vaisseau {

    private int Height, Width, Lifepoint;
    
    public Vaisseau (int Height, int Width, int Lifepoint){
        this.Height = Height;
		this.Width = Width;
        this.Lifepoint = Lifepoint;
    }

    public  int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public int getLifepoint() {
        return Lifepoint;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setWidth(int width) {
        Width = width;
    }
    public void setLifepoint(int lifepoint) {
        Lifepoint = lifepoint;
    }

    public void attaque (){

    }

    public void mvnt_gauche(){

    }

    public void mvnt_droite(){
        
    }
}
