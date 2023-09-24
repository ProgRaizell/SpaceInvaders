public class Monstre {
    
    private int Height, Width, Lifepoint,posX,posY;
    
    public Monstre (int Height, int Width, int Lifepoint, int posX, int posY){

        this.Height = Height;
		this.Width = Width;
        this.Lifepoint = Lifepoint;
        this.posX = posX;        
        this.posY = posY;

    }

    public int getHeight() {
        return Height;
    }
    public int getLifepoint() {
        return Lifepoint;
    }
    public int getWidth() {
        return Width;
    }
    public void setHeight(int height) {
        Height = height;
    }
    public void setLifepoint(int lifepoint) {
        Lifepoint = lifepoint;
    }
    public void setWidth(int width) {
        Width = width;
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

    public void mvnt_bas(){


    }


}
