package ArcadeGlobal;

public class WindowHeight {
    private static final WindowHeight instance = new WindowHeight();
    private int height;

    private WindowHeight() {
        // private constructor to prevent instantiation
        height = 800;
    }

    public static WindowHeight getInstance() {
        return instance;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
}
