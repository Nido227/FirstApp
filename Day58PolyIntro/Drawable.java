package Day58PolyIntro;

public interface Drawable {
    

    public static final String DRAWING_TOOL = "PEN";

    public void draw();

    public default void drawLine(int n){
        System.out.println("Drawing " + n + " Line");
    }

    public static void printDrawingTool(){
        System.out.println("My tool is: " + DRAWING_TOOL);
    }


}
