package ArcadeGlobal;

public class WindowWidth {
    private static final WindowWidth instance = new WindowWidth();
    private int width;

    private WindowWidth() {
        // private constructor to prevent instantiation
        width = 1125;
    }

    public static WindowWidth getInstance() {
        return instance;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width){
        this.width=width;
    }
}
