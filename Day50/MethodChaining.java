package Day50;

public class MethodChaining {
    public static void main(String[] args) {
        //Step 1
        methodA(); 
        //Step 7 ---END OF EXECUTION
    }

    public static void methodA(){
        //Step 2
        methodB();
        //Step 6
        System.out.println(" A called ");
    }


    public static void methodB(){
        //Step 3
        System.out.println(" B called ");
        //Step 4
        methodC();
    }

    public static void methodC(){
        //Step 5
        System.out.println(" C called ");
    }



}
