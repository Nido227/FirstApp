package Day27;

public class Warmup {
public static void main(String[] args) {

boolean result = true;

int [] num = {25,28,23,12,53,67};

// print true if all numbers are more than 10
// print false if not
// print false as long as one number is false

for ( int i = 0; i < num.length; i++){
    if(num[i] <=10){
        result = false;
        break;
    }
}

System.out.println(result);
}  
}
