package Day53;

public class Computer {

    public void systemPolicy(){
        System.out.println("DO NOT CHANGE THIS POLICY");
    }

    public final static void staticSystemPolicy(){
        System.out.println("Don't Change Static Policy");
    }

    public static void main(String[] args) {
        final int x = 100;

        //How many places can variables show up?

        /*
         * inside a method --> local variable
         * on method header inside (..) ---> method parameters
         * under the class outside any method or block ---> field
         */
    }

    
}


class MacBook extends Computer{

    //@Override DOES NOT WORK, CANT OVERRIDE WITH FINAL METHOD
    // public void systemPolicy(){
    //     System.out.println("HAHA I AM REBELIOUS");  
    // }

    //can not hide final static method
    // public final static void staticSystemPolicy(){
    //     System.out.println("Don't Change Static Policy");
    // }


}