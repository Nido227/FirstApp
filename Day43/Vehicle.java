package Day43;
public class Vehicle {
//<this> keyword can be used to address 
//the current object | instance being worked on
String make;
String model;
int speed;

public String getMake() {
    return make;
}


public void setMake(String make) {
    this.make = make;
}


public String getModel() {
    return model;
}


public void setModel(String model) {
    this.model = model;
}


public int getSpeed() {
    return speed;
}


public void setSpeed(int speed) {
    this.speed = speed;
}


public void stop(){
    speed = 0;      //direct way
    this.speed = 0; // using this keyword
    setSpeed(0);
    this.setSpeed(0);
}


public void increaseSpeed(int increaseBy) {
for (int i = 1; i <= increaseBy; i++) {
speed++;
System.out.println("speed: " + i);
}
System.out.println();
}


public void decreaseSpeed(int decreaseBy) {
for (int i = 1; i <= decreaseBy; i++) {
speed--;
System.out.println(speed + "->");
}
System.out.println();
}







}