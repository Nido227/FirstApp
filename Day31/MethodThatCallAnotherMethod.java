package Day31;

public class MethodThatCallAnotherMethod {
public static void main(String[] args) {
/*
 * Step 1: boil water
 * Step 2: add pasta to water
 * Step 3: add olive oil
 * Step 4: add salt
 * Step 5: mix and taste
 * Step 6: put on plate
 * 
 */
//System.out.println("Step 1: boil water");
//System.out.println("Step 2: add pasta to water");
//System.out.println("Step 3: add olive oil");
//System.out.println("Step 4: add salt");
//System.out.println("Step 5: mix and taste");
//System.out.println("Step 6: put on plate");
prepare();
addIngredient();
tasteAndBringToTable();
AskSpouseToPrepareMeal();

}
// Calling method with other methods
public static void AskSpouseToPrepareMeal() {
    prepare();
    addIngredient();
    tasteAndBringToTable();
}


public static void prepare() {
System.out.println("Step 1: boil water");
System.out.println("Step 2: add pasta to water");
}
public static void addIngredient() {
System.out.println("Step 3: add olive oil");
System.out.println("Step 4: add salt");    
}
public static void tasteAndBringToTable() {
System.out.println("Step 5: mix and taste");
System.out.println("Step 6: put on plate");
}




}
