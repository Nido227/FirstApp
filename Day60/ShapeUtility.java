package Day60;
import java.util.concurrent.BlockingQueue;

import Day58PolyIntro.*;

public class ShapeUtility {

    public static void main(String[] args) {

        Shape s1 = new Triangle("Red", 12, 10);
        
        describeTheShape(s1);
        describeTheShape(new Triangle("Red", 12, 10));
        describeTheShape(new Square("blue", 5));

        

    }

    public static Drawable getAnyDrawable(){
        return
    }

    public static Shape getAnyShape(){
        return new Square("blue", 15)
    }

    public static void describeTheShape(Shape anyShape){
        anyShape.draw();
    }

    public static void describeTheShape(Triangle anyTriangle){
        System.out.println("calling describeTheShape(triangle)");
        //anyTriangle.draw();
    }


    
}
