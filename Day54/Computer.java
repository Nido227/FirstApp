package Day54;

public class Computer extends Electronic{
    
    //@Override   //this is a new method, it's not overriding
    public void turnOn(){
        System.out.println("computer");
    }

    @Override   //overriding method in sub class can be optionally final to block sub class of computer from overriding turnOff
    public final void turnOff(){
        System.out.println("Computer off");
    }



}


class Electronic{

    private void turnOn(){
        System.out.println("electronic");
    }

    public void turnOff(){
        System.out.println("electronic off");
    }
}
