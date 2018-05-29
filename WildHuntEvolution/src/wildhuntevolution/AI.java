
package wildhuntevolution;

public class AI extends Animal{
    protected double speed;
    AI(){
        super();  
        speed = 1.1;
    }
    AI(double x, double y, double size, double speed){
        super(x,y,size);
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void movement(){
        
    }
}
