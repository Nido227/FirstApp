package Day46;

public class PersonAction {
public static void main(String[] args) {

Person p1 = new Person("Nido", 5.9f, 'M');
Person p2 = new Person("Taha", 5.10f, 'M');

//static way to access static variable
System.out.println(Person.race);
//non-static way to access static variable (Not Rec)
System.out.println(p1.race);

Person.race = "Humanoid";
System.out.println(p2.race);

p2.race = "Spartan";
System.out.println(p1.race);


}
}
