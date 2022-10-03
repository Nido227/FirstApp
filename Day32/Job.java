package Day32;

public class Job {
public static void main(String[] args) {

// Task 1: create a method that return long
// then return the number you have in mind
// call this method twice and calculate how much you will be making in 2 years

long firstYearSalary = giveme6DigitSalaray();
long secondYearSalary = (long) (firstYearSalary * 1.10);
System.out.println(firstYearSalary);
System.out.println(secondYearSalary);

boolean result = isAdultOrNot(19);
System.out.println(result);
System.out.println(isAdultOrNot(16));

int biggerNum = giveMeBiggerNumber(10,12);
System.out.println(biggerNum);
System.out.println(giveMeBiggerNumber(100, 111));


}

public static long giveme6DigitSalaray() {
return 180000L;
}

// Task 2: 
// create a method called isAdultOrNot
// It takes one int as a parameter and return a boolean
// inside body --> if the number passed is more than 19 return true;
// else return false;
// call your method couple times and print out the result


public static boolean isAdultOrNot(int num) {
if (num > 18){
    return true;
}else{
   return false;
}
}

public static int giveMeBiggerNumber(int num1, int num2) {
int max = (num1>num2) ? num1 : num2;
return max;
}







}
