
package wildhuntevolution;

public class Animal {
    protected double x;
    protected double y;
    protected double size;
    Animal(){
        x = 0;
        y = 0;
        size = 10;
    }
    Animal(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.size = size;
    }
    public final double getX(){
        return x;
    }
    public final double getY(){
        return y;
    }
    public final double getSize(){
        return size;
    }
}
