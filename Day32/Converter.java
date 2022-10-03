package Day32;

public class Converter {
public static void main(String[] args) {

System.out.println(meterToCM(10));
System.out.println(feetToInch(12));
System.out.println(fahToCelcius(32));

// the method returns double -- double can ve sabed in int variable
int cel = (int) fahToCelcius(81);
System.out.println(cel);
double cel1 = fahToCelcius(81);
System.out.println(cel1);
}

// Create a method called meterToCM
// it takes one int as parameter and returns CM

// Create a method called feetToInch
// it takes one int as parameter and returns inch

// Create a method called fahToCelcius
// it takes one double as parameter and returns celcius

public static int meterToCM(int meter) {
return meter*100;
}
public static int feetToInch(int feet) {
return feet/12;
}
public static double fahToCelcius(double fahrenheit) {
return (fahrenheit-32) * 5/9;
}





}