package Day45;

public class MathEquation2 {
 
private double operand1;
private double operand2;
private double result;
private char operator;
    
public MathEquation2(){
    System.out.println("no arg");
}
    
public MathEquation2(double operand1, double operator2, char operator) {
    this.operand1 = operand1;
    this.operand2 = operand2;
    this.operator = operator;
}
    
public void calculateX(double num1, double num2){

// setting new value for operand1 and operand2    
this.operand1 = num1;
this.operand2 = num2;

//do the calculation according to new number and whatever operator value we currently have
//AND WE ALREADY HAVE CALCULATE METHOD TO DO THAT!

calculate();




}


public void calculate(){
    switch (operator) {
        case '+':
        result = operand1 + operand2;
            break;
        case '-':
        result = operand1 - operand2;
            break;
        case '*':
        result = operand1 * operand2;
            break;
        case '/':
         result = operand1 / operand2;
            break;
         default:
    System.out.println("Invalid Operator");
        }
    }
    
    
public double getOperand1() {
    return operand1;
}
public void setOperand1(double operand1) {
    this.operand1 = operand1;
}
public double getOperator2() {
    return operand2;
}
public void setOperator2(double operator2) {
    this.operand2 = operator2;
}
public double getResult() {
    return result;
}
public void setResult(double result) {
    this.result = result;
}
public void setOperator(char operator) {
    this.operator = operator;
}
    
public String toString() {
    return "mathEquation [operand1=" + operand1 + " + " + "operand2=" + operand2 + " result="  + result + "operator=" + operator
            + "]";
}
    
    
    
    
    
}    

