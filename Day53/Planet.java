package Day53;

public class Planet {
    
    //OVERLOADING ONLY CAE ABOUT YOUR METHOD SIGNATURE
    // SAME NAME DIFFERENT PARAMETER LIST

    public void rotate(){
        System.out.println("Roatating");
    }

    public void rotate(int d) {
        System.out.println("Roatating d");
    }

    //WE CAN NOT HAVE TWO METHOD WITH SAME METHOD SIGNATURE IN SAME CLASS
    // public int rotate(int abc) {
    //     System.out.println("Roatating d with return");
    //     return 5;
    // }

    public static int rotate(int d, int y) {
        System.out.println("Roatating d with return");
        return 5;

    }






}
