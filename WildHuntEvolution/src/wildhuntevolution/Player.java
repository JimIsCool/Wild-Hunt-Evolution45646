
package wildhuntevolution;

public class Player extends Animal{
    protected double speed;
    Player(){
        super();  
        speed = 1;
    }
    Player(double x, double y, double size, double speed){
        super(x,y,size);
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void move(){
        
    }
}
