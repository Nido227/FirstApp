package Day41;

public class Student {

// Access Modifiers
/*
 * Public / Protectd / Default / Private
 * we can use it for any methods
 * we can use it for fields
 */


public String name;
public int age;
public long ssn;


public void displayName() {
System.out.println("Name is: " + name);
}

//only accessible within the same class (Student class only)
private void displayNameAndAge() {
System.out.println("Name is: " + name + " Age is: " + age);
}

private void showSSN() {
System.out.println("SSN is: " + ssn);
}



}
