package Day59;
import Day57.ChromeDriver;
import Day57.WebDriver;
import Day58PolyIntro.*;
public class AnimalShow59_1 {
    
    public static void main(String[] args) {
        
        Animal myAnimal = new Dog();
        myAnimal.makeNoise();

        myAnimal = new Cat();
        myAnimal.makeNoise();

        myAnimal = new Horse();
        myAnimal.makeNoise();

        //WebDriver is an interface that we created
        //ChromeDriver is a class that implement WebDriver

        WebDriver driver = new ChromeDriver();
        driver.navigateTo("google");

        //FireofxDriver is a class that implement WebDriver

        /*
         * driver = new FirefoxDriver();
         * driver.navigateTo("google");
         */





        //this is creating object
        //without storing the address of the object
        //and just using it once --like caling method as below

        //this object is not accessible after this line
        //because we did not write down the address
        new Dog().makeNoise();

    }
}
