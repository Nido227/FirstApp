package Day58PolyIntro;

public class Square extends Shape{
    int sizelength;
    
    public Square(String color, int sizelength) {
        this.color = color;
        this.sizelength = sizelength;
    }

    @Override
    public void draw() {
        System.out.println("draw shape");
    }

    public void drawLine() {
        System.out.println("drawing square using 4 line");
    }

    @Override
    public double calculateArea() {
        return sizelength * sizelength;
    }

    @Override
    public String toString() {
        return "Square [color= " + color + "sizelength=" + sizelength + "]";
    }

 
}
