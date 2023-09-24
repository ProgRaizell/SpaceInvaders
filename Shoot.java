public class Shoot {
    private int Height, Width,posX, posY, speed;

    public Shoot (int Height, int Width, int posX, int posY, int speed){
        this.Height = Height;
		this.Width = Width;
        this.posX = posX;
        this.posY = posY;
        this.speed = speed;

    }

    public  int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }

    public int getSpeed() {
        return speed;
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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void update(){
        posY -= speed;
    }
}
