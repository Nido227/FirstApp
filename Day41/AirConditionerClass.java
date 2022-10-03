package Day41;

public class AirConditionerClass {

public static void main(String[] args) {
    
AirConditioner ac1 = new AirConditioner();

ac1.brand = "Samsung";
ac1.currentTemp = 60.0f;
ac1.isOn = true;

ac1.dispayTheBrand();
ac1.showCurrentTemp();
ac1.turnOn();
ac1.turnOff();
ac1.displayAllInfo();
ac1.increaseTemp(10);
ac1.showCurrentTemp();
ac1.decreaseTemp(20);
ac1.showCurrentTemp();
ac1.setTemp(50.5f);
ac1.showCurrentTemp();







}




}
