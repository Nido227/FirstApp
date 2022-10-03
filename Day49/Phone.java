package Day49;

public class Phone extends Device{
    String brand;
    int screenSize;
    
    public Phone(String brand, int screenSize, int serialNum) {
        //super();
        super(serialNum);
        this.brand = brand;
        this.screenSize = screenSize;
        //this.serialNum = serialNum;
    }


    public Phone(){
        //super();
        //Device() BAD
        //super(100);
        System.out.println("Phone Constructor");
    }

    public static void main(String[] args) {
        
        Phone p = new Phone();
        Phone p1 = new Phone("iPhone", 7, 123);

        System.out.println(p1.brand);
        System.out.println(p1.screenSize);
        System.out.println(p1.serialNum);

    }



    //whats the difference between super and this?
    //this(args..) is used to call constructor of same class
    //in another constructor in same class

    //super(args..) is used to all super class' constructor

    //Super(args..) rules
    //it has to be the firsts statement
    //it can be only used on time per constructor
    //super() and this() can not be mixed together




}
