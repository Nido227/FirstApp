package Day47;

import java.util.Random;

public class InstanceBlock {

    int num;

//a block that run everytime an object is being created
//instance block
{
// System.out.println("Initializing launch");
// System.out.println("Setting protocols");
// System.out.println("Checking fuel level");
System.out.println("All system go!");
Random r = new Random();
num = r.nextInt(100);
}

public InstanceBlock(){
        System.out.println("Constructor");
    }

    public InstanceBlock(String name){
        //this();
        System.out.println("Constructor " + name);
    }






}
