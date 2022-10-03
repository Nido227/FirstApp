package Day61;

import java.util.concurrent.CountedCompleter;

public class Electronic {
    public abstract void turnon();

    public static void main(String[] args) {
        
        Electronic item1 = new Computer();
        Electronic item2 = new AirConditioner();

        int cntComputer = 0;
        int cntAC = 0;

        if(item1 instanceof Computer){
            cntComputer ++;
        } else if( item1 instanceof AirConditioner){
            cntAC++
        }

        List<Electronic> allItems = new ArrayList<>();

        allItems.add (new AirConditioner());
        allItems.add (new Computer());
        allItems.add (new Computer());
        allItems.add (new Computer());
        allItems.add (new AirConditioner());
        allItems.add (new Computer());
        allItems.add (new AirConditioner());
        allItems.add (new Computer());
        allItems.add (new AirConditioner());

        for( Electronic each: allItems){
            each.turnon();
            if(each instanceof Computer){
                cntComputer++;
            }else if( each instanceof AirConditioner){
                cntAC++;
            }

        }

        System.out.println("comp count: " + cntComputer);
        System.out.println("comp count L " + cntAC);



    }
}

class Computer extends Electronic{

    @Override
    public void turnOn(){
        System.out.println("Turning on computer");
    }

}

class AirConditioner extends Electronic{

    @Override
    public void turnOn(){
        System.out.println("Turning on AC");
    }

}
