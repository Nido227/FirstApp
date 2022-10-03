package Day19;
public class AppleReverse {
public static void main(String[] args) {
    
String app  = "app";
String reversedApp = "";

reversedApp = reversedApp + app.charAt(2);
System.out.println(reversedApp);

reversedApp = reversedApp + app.charAt(1);
System.out.println(reversedApp);

reversedApp += reversedApp + app.charAt(0);
System.out.println(reversedApp);

int x = 2;
while(x>=0){
    
System.out.println(x);
x--;
}



}    
}
