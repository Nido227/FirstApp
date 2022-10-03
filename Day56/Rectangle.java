package Day56;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(String color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

        //List<String> lst = new ArrayList<>();

        Rectangle s1 = new Rectangle("Red", 7, 10);
        s1.calculatePerimeter();
        System.out.println(s1.calculateArea());
        System.out.println(s1);

        Circle s2 = new Circle("Red", 10);
        System.out.println(s2);
        s2.calculatePerimeter();
        System.out.println(s2.calculateArea());
    }

    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter is: " + (2*width+2*height));
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width 
        + "color= " + color + "]";
    }



    
}
