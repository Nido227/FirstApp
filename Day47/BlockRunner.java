package Day47;

import java.util.Random;

public class BlockRunner {
    public static void main(String[] args) {

        System.out.println("Hello world");

        InstanceBlock b1 = new InstanceBlock();
        System.out.println("-------------" +  b1.num);
        InstanceBlock b2 = new InstanceBlock("jon snow");
        System.out.println("-------------" +  b2.num);


    }
}
