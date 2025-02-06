import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class GranadaCossioGame extends BasicGame {
    protected static final String INTRO_SPLASH_FILE = "assets/SplashImage.gif";
    protected static final String BACKGROUND_IMAGE_FILE = "assets/FlukemarmBackground.gif";

    protected static final String GRUB_WIN_BACKGROUND_IMAGE = "assets/YouWonGrub.gif";
    protected static final String GEO_WIN_BACKGROUND_IMAGE = "assets/YouWonGeo.gif";
    protected static final String LOSS_BACKGROUND_IMAGE = "assets/YouLost.gif";;

    protected static final String RARE_IMAGE_FILE = "assets/rare_get.gif";

    protected static final int GRUB_SCORE_TO_WIN = 5;

    protected static final int SPAWN_INTERVAL = 90;
    
    protected static final Random rand = new Random();

    public static final int SPACE_KEY = KeyEvent.VK_SPACE;

    protected static final int TIME_THRESH = 750;

    protected int currTick = 0;

    protected boolean grubsGot = false;

    protected static int DEFAULT_MOVE_SPEED = 7;

    protected int PLAYER_GRUB_SCORE;
   


    public GranadaCossioGame(){
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
    public GranadaCossioGame(int gameWidth, int gameHeight){
        super(gameWidth, gameHeight);
    }
    protected void pregame(){
        setTitleText("Hollow Knight: Attack of the Flukemarms!");
        setSplashImage(INTRO_SPLASH_FILE);
        this.setBackgroundImage(BACKGROUND_IMAGE_FILE);
        player = new Player(STARTING_PLAYER_X, STARTING_PLAYER_Y);
        displayList.add(player);
        score = 0;
        PLAYER_GRUB_SCORE = 0;
    }

    protected void updateGame(){
        //scroll all scrollable Entities on the game board
        scrollEntities();
        for (int i = 1; i < displayList.size(); i++){
            if (displayList.get(i).isCollidingWith(player)){
                handlePlayerCollision((Consumable)displayList.get(i));  
            }
        }
        //Spawn new entities only at a certain interval
        if (ticksElapsed - currTick > TIME_THRESH && grubsGot == true){
            player.setMovementSpeed(player.getMovementSpeed() - 4);
            grubsGot = false;
        }
        if (ticksElapsed % 20 == 0){            
            spawnEntities(); //how many enties to spwn 
            garbageCollectOffscreenEntities();
        }
        //Update the title text on the top of the window
        setTitleText("HP: " + player.getHP() + ", Score: " + score + ", Grub Score: " + PLAYER_GRUB_SCORE);     
    }

    protected void spawnEntities(){

        ArrayList <Entity> checkList = new ArrayList <Entity>(); 
        for (int i = 0; i < rand.nextInt(0,4); i++ ){ 
            Entity generic;
            int randNum = rand.nextInt(1, 100); 
            
            if(randNum <= 60){ //40% 
                generic = new Avoid (getWindowWidth(), 0); 
                generic.setY(rand.nextInt(getWindowHeight() - generic.getHeight()));
            } else if (randNum > 60 && randNum <= 90){ //40% 
                generic = new Get (getWindowWidth(), 0); 
                generic.setY(rand.nextInt(getWindowHeight() - generic.getHeight()));
             } else if (randNum > 90 && randNum <= 95) {
                generic = new RareGet (getWindowWidth(), 0); 
                generic.setY(rand.nextInt(getWindowHeight() - generic.getHeight()));
            } else {
                generic = new Grub (getWindowWidth(), 0);
                generic.setY(rand.nextInt(getWindowHeight() - generic.getHeight()));
            }
            ifCollision(checkList, generic);
        }    
    }

    protected void handlePlayerCollision(Consumable collidedWith){ 
    
        if (collidedWith.getPointsValue() == 1 && grubsGot == false){
            PLAYER_GRUB_SCORE = PLAYER_GRUB_SCORE + collidedWith.getPointsValue();
            currTick = ticksElapsed;
            player.setMovementSpeed(player.getMovementSpeed() + 4);
            grubsGot = true;
            displayList.remove(collidedWith);
        }
        else {
            score = score + collidedWith.getPointsValue();
            player.setHP(collidedWith.getDamageValue() + player.getHP()); 
            displayList.remove(collidedWith); 
        }
    }

    protected boolean isGameOver(){ 
        if (player.getHP() == 0  || this.score == SCORE_TO_WIN || PLAYER_GRUB_SCORE == GRUB_SCORE_TO_WIN){
            return true; 
        }
        return false;   
    } 

    protected void postgame(){ 

        if (isGameOver() == true){
            isPaused = true; 
        } 
        System.out.println(ticksElapsed);
        if (this.score == SCORE_TO_WIN){
            this.setSplashImage(GEO_WIN_BACKGROUND_IMAGE);
            setTitleText("GAME OVER! - You Won!");  

        } 
        else if (PLAYER_GRUB_SCORE == GRUB_SCORE_TO_WIN){
            this.setSplashImage(GRUB_WIN_BACKGROUND_IMAGE);
            setTitleText("GAME OVER! - You saved all the Grubs!");
        }
        else {
            this.setSplashImage(LOSS_BACKGROUND_IMAGE);
            setTitleText("GAME OVER! - You Lost!");  
        }
    }
 
}

