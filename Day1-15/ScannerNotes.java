import java.util.Scanner;

import javax.management.modelmbean.ModelMBeanOperationInfo;

public class ScannerNotes {

    public static void main(String[] args) {
    
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    //Ask user questions
    System.out.println("Enter your mood: ");

    //Save user input into String
    String mood = input.next();

    //Ask user another question
    System.out.println("Where are you located? ");
    String location = input.next();

    //Outprint 
    System.out.println("You mood today is: " + mood + " and you are located at: " + location);

    //Closing Scanner
    input.close(); 

   System.out.println("Enter your name: ");
    String name = input.nextLine();

    System.out.println("Enter your age: ");
    int age = input.nextInt();

    System.out.println("Your name is: " + name + "\nYour age is: " + age );   

    //Task HW 
   int areaCode = input.nextInt();
    int phoneNumber = input.nextInt();

    System.out.println("Enter your area code: "); 
    System.out.println("enter your phone numner: ");
    System.out.println("Your phone number is:" + "(" + areaCode + ")-" + phoneNumber); 

    int a = 10, b = 20, c = 10;
    boolean b1 = a > b;
    boolean b2 = a >= c;

    System.out.println("a is more than b: " + b1);
    System.out.println("a is more than or equal to c: " + b2);
    boolean bothMeetRequirement = b1 && b2;
    System.out.println("Are both conditions met " + bothMeetRequirement);

    boolean isHungry = true;
    boolean isBreakTime = true;
    boolean isYourLunchReady = true;
    
    System.out.println("Are you both hungry and is it break time? " + (isHungry && isBreakTime)); 
    System.out.println("Are you hungry or is it break time " + (isHungry || isBreakTime));

    boolean reverseIsHungry = ! isHungry;
    System.out.println("Before reversing " + isHungry);
    System.out.println("After reverse is Hungry " + reverseIsHungry);

    boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady;
    System.out.println("Hungry. break time, meal is ready " + areWeSuperReady); 

    int score = 10;
    boolean result1 = score > 4;
    boolean result2 = score > 4 && score <11;
    boolean result3 = score > 14 && score <11;
    boolean result4 = score > 14 || score <11;


    System.out.println("result is " + result1);
    System.out.println("result is " + result2);   

    


}
}
    
