import java.util.Scanner;
public class amazonShopper {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Welcome to Amazon");
System.out.println("What is the total of your cart");
double price = scan.nextDouble();

System.out.println("Are you a Prime Member? ");
Boolean isPrimeMemer = scan.nextBoolean();

if(isPrimeMemer == true){
    System.out.println("Thank you for being a Prime Member! You get Free Shipping! " + price);
}else if(price> 35){
    System.out.println("You get Free Shipping! " + price);
    System.out.println("You may consider getting Amazon Prime! ");
}else{
    price+=5;
    System.out.println("You have to pay $5 for shipping. " + price);
    System.out.println("You may consider getting Amazon Prime! ");
}






}
}
