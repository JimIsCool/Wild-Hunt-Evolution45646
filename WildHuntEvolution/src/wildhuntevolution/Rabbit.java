
package wildhuntevolution;

public class Rabbit extends Player {
    protected String ability;
    Rabbit(){
        super();
        ability = "sprint";
    }
    Rabbit(double x, double y, double size, double speed, String ability){
        super(x,y,size,speed);
        this.ability = ability;
    }
    public void draw(){
        
    }
    public void sprint(){
        
    }
    public String getAbility(){
        return ability;
    }
}
