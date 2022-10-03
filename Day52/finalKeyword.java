package Day52;

class data{
    public void method2(){
        System.out.println("original");
    }

}

public class finalKeyword extends data{

    @Override
    public final void method2(){
        System.out.println("override");
    }

    final static int b;
    static{
        b=20;
    }// static block executed as soon as the class is loaded

    final int C;
    public finalKeyword() {
       // C=90;
    }

    {
        C=100;
    }


    public static void main(String[] args) {
        final int a=9;

        //a=10;    final cannot be modified
        System.out.println();

        final int c;
        c=10;
        System.out.println(c);
    }





    /*
     * Variable cannot re-assign its value
     * Instance variable must be initialized
     * Class: cannot be extended
     * Method: cannot be overrided
     */
    
}
