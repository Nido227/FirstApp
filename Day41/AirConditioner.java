package Day41;

public class AirConditioner {

String brand;
float currentTemp;
boolean isOn;

public void dispayTheBrand() {
System.out.println("Brand name is: " + brand);
}

public void showCurrentTemp() {
System.out.println("Current temp is: " + currentTemp);
}

public void turnOn() {
System.out.println("Is on: " + isOn);
if(isOn == false){
    isOn = true;
} else {
System.out.println("It is already on.");
}
}

public void turnOff(){
if(isOn) {
isOn = false;
System.out.println("It has been turned off.");
}else{
System.out.println("It is already off.");
}
}

public void displayAllInfo() {
System.out.println("Brand is: " + brand + " Current temp is: " + currentTemp);
}

public void increaseTemp(int x) {
currentTemp = currentTemp + x;
}

public void decreaseTemp(int y) {
currentTemp = currentTemp - y;
}

public void setTemp(float targetTemp) {
currentTemp = targetTemp;
}









}
