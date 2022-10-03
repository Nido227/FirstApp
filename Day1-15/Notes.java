import java.util.Scanner;

public class Notes {

    public static void main(String[] args) {
       System.out.println("Hello World!"); 
 /* 
        int count;
       count = 10;
       count = 200; //second one always used if the variable name is the same
       System.out.println(count);

        int x, y, z ;
       x = 10;
       y = 20;
       z = x + y;

       System.out.println(z);

       // BYTE SHORT INT LONG
        byte numberOfLetter = 26;
        short milesAcrossUS = 7500;
        int billionNumber = 1000000;
        long veryLongNumber = 280000000000L;

        System.out.println(numberOfLetter);
        System.out.println(milesAcrossUS);
        System.out.println(billionNumber);
        System.out.println(veryLongNumber);

        //  FLOAT AND DOUBLE
        float priceOfBook = 12.99f;
        double longerDecimal = 1.123456789d;

        System.out.println(priceOfBook);
        System.out.println(longerDecimal);

        // CHAR
        char c1 = 'a';
        char c2 = '1';
        char c3 = '.';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // BOOLEAN
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);

        //STRING
        String name = "Nido";
        String sentence = " Hello welcome to my sentence.";
        //If you dont use the "ln" it will print on the same line
        System.out.print(name);
        System.out.println(sentence);

        //Concatenation
        String fullName = "Nido Ozl";
        String city = "Queens";
        String state = "New York";
        String nationality = "Turkish";
        System.out.println("My name is " + fullName);
        System.out.println("My city is " + city);
        System.out.println("My nationality is " + nationality );
     
        //Concatenation adding many strings
        String firstName = "Nido";
        String lastName = "Ozl";
        String middleName ="Cristiano";
        System.out.println("My first name is "+ firstName + ", last name is " + lastName + " middle name is " + middleName);
        System.out.println("first and last name is " + firstName + lastName);

        System.out.println("Hello my name is " + fullName + " I am from " + city + "," + state + "." + " And my nationality is " + nationality);
       
        // Making new line in print statement... using \n
        //1 name per line
        String name1 = "Adem", name2 = "Jillian", name3 = "Jay";
        System.out.println(name1 + " " + name2 + " " + name3 + " ");
        System.out.println(name1 + " \n" + name2 + " \n" + name3 + " ");
        // Making a tab in print statement
        System.out.println(name1 + " \t" + name2 + " \t" + name3 + " ");


        int a = 20;
        int b = 15;
        int c = a - b;
        System.out.println("The result of adding the two is " + (a+b));
        System.out.println("The result of subtracting the two is " + (a-b);

        int i = 15 , j = 3 ;
        int addition = i+j;
        int subtraction = i-j;
        int multiplication = i*j;
        int division = i/j;
        int modular = i%j;

        System.out.println(addition + " \t" + subtraction + " \t" + multiplication + " \t" + division +" \t" + modular);

        float priceCucumber = 2.50f;
        int priceTomatoe = 3;
        float priceOnion = 1.50f;
        int pricePepper = 2;
        int priceCarrot = 4;

        System.out.println("The price of 1 cucumber is $" + priceCucumber*1 );
        System.out.println("The price of 4 tomatoes are $" + priceTomatoe*4);
        System.out.println("The price of 2 onions is $" + priceOnion*2);
        System.out.println("The price of 1 pepper is $" + pricePepper*1);
        System.out.println("The price of 6 carrots is $" + priceCarrot*6);

        double totalPrice = priceCucumber*1 + priceTomatoe*4 + priceOnion*2 + pricePepper*1 + priceCarrot*6;
        System.out.println("Your total is: $ " + totalPrice);

        //adding to an integer
        int i = 10;
        System.out.println("Your score is " + i );
        i = i + 5;
        System.out.println("Your new score is " + i );
        // i = i + 1  is the same as  i += 1
        i += 1;
        System.out.println("Score is " + i);
        //i++ and ++i means PRE AND POST increment
        
       SHORTHAND ASSIGNMENT OPERATORS
        i += 8 equals i = i + 8
        i -= 8 equals i = i - 8
        i *= 8 equals i = i * 8
        i /= 8 equals i = i / 8
        i %= 8 equals i = i % 8               
    

        //PRACTICE USING SHORTHANF ASSIGNMENT OPERATORS
        int offerCount = 1;
        System.out.println("Your current offer count is: " + offerCount);     
        offerCount += 5;
        System.out.println("Your offer count is: " + offerCount);
        offerCount -= 2;
        System.out.println("Your offer count is: " + offerCount);
        offerCount *= 4;
        System.out.println("Your offer count is: " + offerCount);
        offerCount /= 2;
        System.out.println("Your offer count is: " + offerCount);
        offerCount %= 5;
        System.out.println("Your offer count is: " + offerCount);

        //Increament + Decrement
        // --b = PREIncrement
        // b-- = POSTIncrement
     
        int score = 10;
        int result = score++;
        System.out.println("result is " + result);
        score = score++ + ++score;
        System.out.println(score); 
    */

      /*   int medium = 10;
        //byte, short, int, long
        //shot, tall, medium, grande //Starbucks cup size

        //long grande = 10;
        long grande = medium;
        System.out.println(grande);

        //Type widening or upcasting

       // short tall = 5L;  can NOT put long value inside any variable that has smaller range\

       short tall = (short) grande;  //typing narrowing / downcasting  */

      // double superGrande = 15.67d;
     //  int mediumCup = (int)superGrande; //Letting me know that it will overfill. I know I will lose data, I still want to continue
      // System.out.println(mediumCup); 

      byte tinyExpressoCup = 2;
      int mediumCup = tinyExpressoCup;  //type widening or upcasting HAPPENS AUTOMATICALLY SMALL TO BIG IS AUTO
    //int mediumCup = (int) tinyExpressoCup;

    //NOTES: 
    //Converting from one data type to another data type
    //Converting from smaller data type to biggger type is called type widening / upcasting
    //Converting from bigger data type to smaller type is called type narrowing / downcasting
    //Downcasting require explicit casting operation, Example:
    // long grande = 1000L; int medium = (int) grande;

    











        

        
    }
}