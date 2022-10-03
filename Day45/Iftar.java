package Day45;

import Day18.fiveDollarORTenDollar;

public class Iftar {

String food;
String time;
String beverage;

public Iftar (String food, String time, String beverage){
    // this.food = food;
    // this.time = time;
    // this.beverage = beverage;
    setFood(food);
    setTime(time);
    setBeverage(beverage);
}


public String toString() {
    return "Iftar [beverage=" + beverage + ", food=" + food + ", time=" + time + "]";
}


public String getFood() {
    return food;
}
public void setFood(String food) {
    this.food = food;
}
public String getTime() {
    return time;
}
public void setTime(String time) {
    this.time = time;
}
public String getBeverage() {
    return beverage;
}
public void setBeverage(String beverage) {
    this.beverage = beverage;
}



}
