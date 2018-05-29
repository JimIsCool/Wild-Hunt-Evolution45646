
package wildhuntevolution;

public class Dragon extends AI{
    protected String ability;
    Dragon(){
        super();
        ability = "flamethrower";
    }
    Dragon(double x, double y, double size, double speed, String ability){
        super(x,y,size,speed);
        this.ability = ability;
    }
    public void draw(){
        
    }
    public void flamethrower(){
        
    }
    public String getAbility(){
        return ability;
    }
}
