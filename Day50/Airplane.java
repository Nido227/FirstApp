package Day50;

public class Airplane extends Vehicle{
    private int wingCount; 

    public Airplane(String brand, String model, int year, int wingCount){
        super(brand, model, year);
        this.wingCount = wingCount;
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    @Override
    public String toString() {
        return "Airplane [wingCount=" + wingCount + 
        ", year= " + year + ", brand= " + getBrand() +
         ", model= " + getModel() + "]";
    }

    public static void main(String[] args) {
        Airplane a1 = new Airplane("boeing", "737", 2012, 2);
        System.out.println(a1.toString());
    }
    







    
}
