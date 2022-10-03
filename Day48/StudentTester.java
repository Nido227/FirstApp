package Day48;

public class StudentTester {
    public static void main(String[] args) {

    Person p1 = new Person();
    p1.name = "Nido";
    p1.age = 25;
    p1.height = 5.5f;
    p1.gender = 'M';
    p1.eat();

    System.out.println(p1.height);

    Student s1 = new Student();
    s1.name = "Taha";
    s1.age = 15;
    s1.height = 5.8f;
    s1.gender = 'F';
    s1.studentID = 123;
    s1.eat();

    System.out.println(s1.studentID);
}



}
