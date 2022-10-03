package Day54;

public class WarmUp {
    int num = 100;
    //num = 200;

    {
        num = 150;
    }

    public WarmUp(){
        num = 200;
    }

    public WarmUp(int x){
        num = 150;
        num = 400;
    }


    public static void main(String[] args) {
        
        WarmUp w = new WarmUp();
        System.out.println(w.num);



    }






}
