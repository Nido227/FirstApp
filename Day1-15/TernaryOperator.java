
public class TernaryOperator {
public static void main(String[] args) {

int score = 98;
String abc = "";

if(score>75)
abc = "pass";
else
abc = "fail"; 

abc = (score>75) ? "pass" : "fail"; 
System.out.println(abc);


}
}
