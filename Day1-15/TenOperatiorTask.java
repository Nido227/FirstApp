public class TenOperatiorTask {
public static void main(String[] args) {

double price = 99.99;
String label;

if(price>100){
    label= "expensive";
}else if (price<90){
    label = "moderate";
}else{
    label = "cheap";
}

label = (price>100) ? "expensive" : (price>90) ? "moderate" : "cheap" ;
System.out.println(label);

//String label2 = (price<=100 && price>90) ? "moderate" : "cheapOrExp";

}
}
