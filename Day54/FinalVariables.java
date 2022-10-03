package Day54;

public class FinalVariables {
    
    public static void main(String[] args) {
        final int x = 10;
        //x = 12;   // Cannot reassign value for final variable

        //a reference variable stores address of the object
        //once its pointed to the object, it cannot point to different object
        final Building b1 = new Building(100);
        b1.num = 200;
        System.out.println(b1.num);

        //b1 = new Building(300);
        //This is not allowed, cannot change the address of b1.

        Building b2 = b1;

        System.out.println(b1.num);
    }
}


class Building{
    
    int num;
    public Building (int num) {
        this.num = num;
    }

}



