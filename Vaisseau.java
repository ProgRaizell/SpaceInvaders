public class Vaisseau {

    private int Height, Width, Lifepoint,posX, posY;
    
    public Vaisseau (int Height, int Width, int Lifepoint, int posX, int posY){
        this.Height = Height;
		this.Width = Width;
        this.Lifepoint = Lifepoint;
        this.posX = posX;
        this.posY = posY;
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
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPosY(int posY) {
        this.posY = posY;
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
