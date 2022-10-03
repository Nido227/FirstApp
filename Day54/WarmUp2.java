package Day54;

import java.util.Random;

public class WarmUp2 {
    int num = getANumber();

    public static void main(String[] args) {
        
        WarmUp2 w = new WarmUp2();
        System.out.println(w.num);
    }

    public int getANumber(){
        Random r = new Random();
        int number = r.nextInt(100);
        return number;
    }
}

