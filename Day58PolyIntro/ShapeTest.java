package Day58PolyIntro;

public class ShapeTest {

    public static void main(String[] args) {
        
        Drawable d1 = new Triangle("red", 12, 10);
        d1.draw();
        d1.drawLine(2);

        d1 = new Square("Blue", 4);
        d1.draw();
        d1.drawLine(2);

        System.out.println("-------------------------");

        Drawable d0 = new Square("red", 5);
        Drawable d2 = new Triangle("yellow", 5, 5);
        Drawable d3 = new Triangle("blue", 5, 5);
        Drawable d4 = new Square("greem", 5);

        Drawable[] allDrawables = {d0, d1, d2, d3, d4};
        
        for (Drawable each : allDrawables) {
            each.draw();
            
        }


    }

    public static void DrawMyDrawableStuff(Drawable anythingDrawable){

    }
    
}
