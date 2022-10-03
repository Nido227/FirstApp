package Day58PolyIntro;

public class Triangle extends Shape{
    int base, height;

    public Triangle(String color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    public static void main(String[] args) {
    
        Triangle t1 = new Triangle("red", 10, 5);
        System.out.println(t1.calculateArea());

        t1.draw();
        t1.drawLine(3);

        Square s1 = new Square("blue", 5);
        System.out.println(s1.calculateArea());

        s1.draw();
        s1.drawLine(4);
        
        System.out.println(DRAWING_TOOL);
    }



    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }

    @Override
    public double calculateArea() {
        return base*height / 2;
    }

    @Override
    public String toString() {
        return "Triangle [color=" + color + "base=" + base + ", height=" + height + "]";
    }

  


    
}
