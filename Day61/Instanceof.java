package Day61;
import Day58PolyIntro.*;

public class Instanceof {
    
    public static void main(String[] args) {

        Animal a1 = getMyAnimal();

        //Cat c1 = (Cat) a1;
        String objName = a1.getClass().getSimpleName();
        System.out.println(objName);  //output should be Cat

        //instanceof operator is for checking your 
        //object type IS-A the type you specified

        boolean isDog = a1 instanceof Dog;
        System.out.println("  is a1 pointint to a type of Dog : " + isDog); 

        boolean isCat = a1 instanceof Cat;
        System.out.println("  is a1 pointint to a type of Dog : " + isCat); 

        if( isCat==true){
            Cat c1 = (Cat) a1;
            System.out.println(c1.legsCount);
        }else if(isDog ==true){
            Dog d1 = (Dog) a1;
            System.out.println(d1.legsCount);
        }
    }

    public static void Animal(getMyAnimal){
        return new Cat(); //new Cat();
    }
}
