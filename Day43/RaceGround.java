package Day43;

public class RaceGround {
public static void main(String[] args) {

Vehicle car1 = new Vehicle();
car1.make = "Mercedes";
car1.model = "C300";
car1.speed = 100;

System.out.println(car1.getMake());
System.out.println(car1.getModel());
car1.increaseSpeed(6);
System.out.println(car1.getSpeed());

Vehicle car2 = new Vehicle();
car2.make = "Tesla";
car2.model = "Model3";
car2.speed = 50;

car2.increaseSpeed(10);
car2.decreaseSpeed(5);
System.out.println(car2.getSpeed());





//increasing speed by 1.. 10,11,12,13,14,15 end
//for (int i = speed; i <= speed+increaseBy; i++) {
///    System.out.print(i + "->");
//} 






}
}