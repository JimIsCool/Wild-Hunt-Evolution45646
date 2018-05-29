
package wildhuntevolution;

public class Tiger extends Player {
    protected String ability;
    Tiger(){
        super();
        ability = "roar";
    }
    Tiger(double x, double y, double size, double speed, String ability){
        super(x,y,size,speed);
        this.ability = ability;
    }
    public void draw(){
        
    }
    public void roar(){
        
    }
    public String getAbility(){
        return ability;
    }
}
