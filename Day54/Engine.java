package Day54;

public class Engine {
    final String engineType;
    final int cylinderCount;

    public Engine(String engineType, int cylinderCount) {
        this.engineType = engineType;
        this.cylinderCount = cylinderCount;
    }

    public void start(){
        System.out.println("engine: < " + engineType + " >, cylinder type: : "
    + cylinderCount + " >");
    }

    @Override
    public String toString() {
        return "Engine [cylinderCount=" + cylinderCount + ", engineType=" + engineType + "]";
    }

    



    
}
