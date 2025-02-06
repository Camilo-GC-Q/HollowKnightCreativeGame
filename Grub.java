public class Grub extends Get{

    protected static final String GRUB_IMAGE_FILE = "assets/grub.gif";

    public Grub(int x, int y){
        super(x, y, GRUB_IMAGE_FILE);
    }

    public Grub(){
        this(0, 0);
    }

    public int getPointsValue(){
        return 1;
    }

    public int getDamageValue(){
        return 1;
    }
    
}
