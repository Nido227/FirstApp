package Day42;

import java.util.*;

public class EmployeeAction {
public static void main(String[] args) {

Employee e1 = new Employee();
e1.name = "Nido";
e1.age = 22;
e1.title = "Senior Tester";
e1.salary = 90000;
e1.printAllInfo();

Employee e2 = new Employee();
e2.name = "Taha";
e2.age = 23;
e2.title = "Senior Developer";
e2.salary = 100000;
e2.printAllInfo();

Employee e3 = new Employee();
e3.name = "Kaan";
e3.age = 39;
e3.title = "Senior Engineet";
e3.salary = 120000;
e3.printAllInfo();

ArrayList<String> names = new ArrayList<>();


ArrayList<Employee> myPeople = new ArrayList<>();
myPeople.add(e1);
myPeople.add(e2);
myPeople.add(e3);
myPeople.add( new Employee() );

for (int i = 0; i < myPeople.size(); i++) {

//store each item -- Employee Object
    Employee each = myPeople.get(i);

// calling method using this variable
    myPeople.get(i).printAllInfo();
}

System.out.println(myPeople.size());

//System.out.println(myPeople.get(3));

// 1 BY 1 ...
Employee firstItem = myPeople.get(0);
firstItem.printAllInfo();
Employee secondItem = myPeople.get(1);
secondItem.printAllInfo();
Employee thirdItem = myPeople.get(2);
thirdItem.printAllInfo();
Employee fourthItem = myPeople.get(3);
fourthItem.printAllInfo();

//PRINT OUT ALL EMPLOYEE THAT MAKE OVER 100K
//COUNT EMPLOYEE THATS YOUNGER THAN 30

//SAVE THE NAME OF ALL EMPLOYEE WHO IS MORE THN 25 INTO S
//STRING VARIABLE NAMES

//Task1
System.out.println("--OVER 100K--");
for (int i = 0; i < myPeople.size(); i++) {
    Employee each = myPeople.get(i);
    if(each.salary>=100000){
        each.printAllInfo();
    }
}


//Task2
System.out.println("--YOUNGER THAN 30--");
int youngstersCount = 0;
for (Employee each : myPeople) {
    if(each.age < 30);
    youngstersCount++;
}
System.out.println("Younger than 30 count is: " + youngstersCount);


//Task3
System.out.println("--SAVE EMPLOYEES OVER 25--");
String namess = "";
for (int i = 0; i < myPeople.size(); i++) {

if(myPeople.get(i).age >25){
namess = namess + myPeople.get(i).name;
}
}
System.out.println("People over 25: " + namess);




}
}
