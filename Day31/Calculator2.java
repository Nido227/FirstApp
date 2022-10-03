package Day31;

public class Calculator2 {
public static void main(String[] args) {

int a = 100;
int b = 30;

calculate('+', a , b);
calculate('-', a , b);
calculate('*', a , b);
calculate('/', a , b);
calculate('%', a , b);

}

public static void calculate(char operator, int firstNum, int secondNum) {
    
switch (operator) {
        case '+':
        System.out.println("result of addition is: " + (firstNum + secondNum));
        break;
        case '-':
        System.out.println("result of sub is: " + (firstNum - secondNum));
        break;
        case '*':
        System.out.println("result of mult is: " + (firstNum * secondNum));
        break;
        case '/':
        System.out.println("result of div is: " + (firstNum / secondNum));
        break;
        case '%':
        System.out.println("result of mod is: " + (firstNum % secondNum));
        break;

    default:
    System.out.println("INVALID OPERATOR");
        break;
}
}


}
