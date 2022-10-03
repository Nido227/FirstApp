package Day27;

public class ForEachLoop {
public static void main(String[] args) {

int[] nums = {1,33,567,1,22};

for( int i = 0; i < nums.length; i++) {
int eachItem =  nums[i];
System.out.println(eachItem);
}

System.out.println();

//for each loop syntax
/*
 * for ( eachItemDataType variable name : collectionVariable/Array Variable) {
 *       your action in here }
 * 
 * for each loop or enhanced loop
 * 
 * for each loop can only be used for looping through collection type
 */

for( int eachItem : nums ){
    System.out.println(eachItem);
}

String [] names = {"Aliya", "Rayan", "Nido"};
for (String eachStr:names){
    System.out.println(eachStr);
}

double [] dbl = {12.3,15.8, 20};
for ( double eachDbl : dbl){
    System.out.println(eachDbl);
}









}
}
