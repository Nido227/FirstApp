import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.SysexMessage;
public class IfElse {

 public static void main(String[] args) {
Scanner input = new Scanner(System.in);
/*System.out.println("What is your score? ");
int score = input.nextInt();

System.out.println("Current score is: " +score);

if(score > 60 ){
    System.out.println("You have passed! ");}
    else{
        System.out.println("You have failed!");
    }  */

    double iPhonePrice = 599.99 , iPadPrice = 899.99 , yourBudget;
    int phoneCount, tabletCount ;

    System.out.println("Enter iPhone count: ");
    phoneCount = input.nextInt();
    System.out.println("Enter iPad count: ");
    tabletCount = input.nextInt();

    System.out.println("Enter your budget: ");
    yourBudget = input.nextDouble();

    double total = iPhonePrice * phoneCount + iPadPrice * tabletCount;
    
    System.out.println("The total is: $" + total);

    if(total>yourBudget){
        System.out.println("Out of budget. ");
        System.out.println("You need extra $" + (total-yourBudget));
    }else{
    System.out.println("I will take it. ");
    }



    }
}


