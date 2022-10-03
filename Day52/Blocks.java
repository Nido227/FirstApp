package Day52;

public class Blocks {
    /*
     * Instance block: initialzing variables   (Belongs to objects)
     *     execution depends on the creation of the object (just like constructor)
     *     executed before the constructor
     * 
     * Static block: initializing class variables (belongs to class)
     *     executes as soon as class is loaded
     */

     static{
        System.out.println("Static block");
     }

     static{
        System.out.println("Static block2");
     }

     {
        System.out.println("Instance block");
     }

     {
        System.out.println("Instance block2");
     }


     public Blocks(){
        System.out.println("Constructor");
     }

     public static void main(String[] args) {
        Blocks obj = new Blocks();
        Blocks obj2 = new Blocks();
     }




    }
