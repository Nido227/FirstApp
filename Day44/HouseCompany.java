package Day44;

public class HouseCompany {
public static void main(String[] args) {

House h1 = new House("Single House", 5, 120000);
House h2 = new House("Town House", 3, 50000);
House h3 = new House("Mansion", 10, 250000);
House h4 = new House("Apartment", 4, 80000);

// immuteable object means
// once its created, it can not be changed
//READ ONLY OBJECT ***** important 

//non-resizeale -- array
// it can not change in size, no shrink no expand
//can we change array? Yes. arr[0] = new value

//Write Only Object

h1.setBedRoom(6);  //Changning bedroom of house one to 6 instead of 5 using .set Method
h3.setType("Single House");  //Changing the type of house of house 3 to a "Single House" using .set Method

System.out.println(h1);
System.out.println(h2);
System.out.println(h3);
System.out.println(h4);

System.out.println(h1.getType());
System.out.println(h1.getBedRoom());
System.out.println(h1.getPrice());






}








}
