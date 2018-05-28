
package wildhuntevolution;

public class Fox extends Player {
    protected String ability;
    Fox(){
        super();
        ability = "bite";
    }
    Fox(double x, double y, double size, double speed, String ability){
        super(x,y,size,speed);
        this.ability = ability;
    }
    public void draw(){
        
    }
    public void bite(){
        
    }
    public String getAbility(){
        return ability;
    }
}
