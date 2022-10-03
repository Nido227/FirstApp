package Day57;

public class IceCoffee implements Drinkable{

    int size;
    public IceCoffee() {
    size = 3;
    }

    public static void main(String[] args) {
        Burger b1 = new Burger("Nido", 3);
        b1.eat();

        IceCoffee c1 = new IceCoffee();
        c1.eat();
        c1.drink();
    }

    @Override
    public String toString() {
        return "IceCoffee [size=" + size + "]";
    }

    @Override
    public void eat() {
        System.out.println("Eating gooooood burger");
    }

    @Override
    public void drink() {
        System.out.println("Drinkning goooood drink");
    }

    

    
    
}
