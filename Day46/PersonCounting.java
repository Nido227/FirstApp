package Day46;

public class PersonCounting {
public static void main(String[] args) {

Person p1 = new Person("Nido", 5.9f, 'M');
System.out.println(p1.counter);

Person p2 = new Person("Taha", 5.10f, 'M');
System.out.println(p2.counter);

Person p3 = new Person();
System.out.println(p3.counter);
    
System.out.println(Person.counter);

}



}
