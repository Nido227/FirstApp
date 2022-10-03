package Day47;

public class Bike {

private String brand;
private int gear;
private int speed;
private int id;

private static int countOfBike;

private Bike() {
    System.out.println("no arg constructor is being called");
}

public Bike(String brand, int gear, int speed) {
    this();
    this.brand = brand;
    this.gear = gear;
    this.speed = speed;
    ++countOfBike;
    this.id = countOfBike;
}

public static void showCurrentCount(){
    System.out.println("Current Count of Object is " + countOfBike);
}

public static void resetCount(){
    countOfBike = 0;
}

public void speedUp(int increaseBy) {
    speed = speed + increaseBy;
}

public String toString() {
    return "Bike [brand=" + brand + ", gear=" + gear + ", id=" + id + ", speed=" + speed + "]";
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public int getGear() {
    return gear;
}

public void setGear(int gear) {
    this.gear = gear;
}

public int getSpeed() {
    return speed;
}

public void setSpeed(int speed) {
    this.speed = speed;
}

public int getId() {
    return id;
}


















}













