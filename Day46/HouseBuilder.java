package Day46;

public class HouseBuilder {
    
public static void main(String[] args) {

CyberHouse h1 = new CyberHouse(1, "Victorian");
CyberHouse h2 = new CyberHouse(2, "Spanish");

// accessing static variable
// we access static members using static way
//className.staticFieldName
//className.staticMethodName()

CyberHouse.neighborhoodName = "CyberTek Corner";

System.out.println(CyberHouse.neighborhoodName);

System.out.println(h1.houseNumber);
System.out.println(h2.houseNumber);
h1.houseNumber = 100;
System.out.println(h2.houseNumber);

//cam we use object to access static variable
//even tho its recommended to use static way
//and it is classname.staticVariable

System.out.println(h1.neighborhoodName);
System.out.println(h2.neighborhoodName);
//changing static variable value of using static way
//or using object WILL affect each every object
h1.neighborhoodName = "CyberTek Tower";
System.out.println(h2.neighborhoodName);






}



}
