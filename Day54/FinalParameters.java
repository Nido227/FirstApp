package Day54;

public class FinalParameters {
    
    public static void main(String[] args) {
        
        printItem("abc efg");

    }


    public static void printItem(final String item){

        //item = "some other value";
        System.out.println("the item is: " + item);
    }












}
