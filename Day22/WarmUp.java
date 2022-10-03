package Day22;
import java.util.Scanner;
public class WarmUp {
public static void main(String[] args) {
Scanner scan = new Scanner((System.in));

//WARM UP
//EACH DAY THE POPULATION IS GONE BY ZOMBIE ATTACK
/* DAY 0 = 6 PEOPLE
 * DAY 1 = 3 PEOPLE
   DAY 2 = 1 PEOPLE  
   ---- EXTINCT--- 
   */

System.out.println("Enter inhabitant count: ");
int inhabitants = scan.nextInt();
int day = 0;

while(inhabitants>0){
    System.out.println("Day" + day + " ["+ inhabitants + "] " );
    inhabitants=inhabitants/2;
    day++;
}

System.out.println("---- EXTINCT----");
}    
}
