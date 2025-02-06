//A RareGet is a special kind of Get that spawns more infrequently than the regular Get
//When consumed, RareGets restores the Player's HP in addition to awarding points
//Otherwise, behaves the same as a regular Get
public class RareGet extends Get{
    
    //Location of image file to be drawn for a RareGet
    protected static final String RAREGET_IMAGE_FILE = "assets/soul.gif";
    
    public RareGet(){
        this(0, 0);        
    }
    
    public RareGet(int x, int y){
        super(x, y, RAREGET_IMAGE_FILE);  
    }
    

    public int getPointsValue(){

        return 0;
    }
    
    //Colliding with a Get does not affect the player's HP
    public int getDamageValue(){
        return 1;
    }
}