package Day53;

public class TropicalFruit extends Fruit{
    public static void main(String[] args) {

        generateJuice();
        Fruit.generateJuice();
        TropicalFruit.generateJuice();
    }
    
    //hiding static method.... you cant override a static method, you can only hide*
    public static void generateJuice(){
        System.out.println("TropicalFruit Juice");
}


}

//----------DIFFERENT CLASS------------

class Fruit {
    public static void generateJuice(){
        System.out.println("Fruit Juice");
}

}
