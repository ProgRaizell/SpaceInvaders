public class Monstre {
    
    private int Height, Width, Lifepoint;
    
    public Monstre (int Height, int Width, int Lifepoint){
        this.Height = Height;
		this.Width = Width;
        this.Lifepoint = Lifepoint;
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

    public void mvnt_bas(){

    }



}
