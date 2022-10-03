package Day51;

public class Horse extends Animal{
    @Override
    public void makeNoise(){
        super.makeNoise(); //must put super. 
        super.eat();
        eat();      //all of these will work
        this.eat();
        System.out.println("Neigh neigh");
    
}
}
