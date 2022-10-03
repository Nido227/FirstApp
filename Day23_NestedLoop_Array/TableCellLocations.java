package Day23_NestedLoop_Array;
import java.util.Scanner;
public class TableCellLocations {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

/*
 * Create a program to print out
 * each location of cell in this format
 * 
 * table with 2 column and 2 row
 * 
 * cell(1,1) cell(1,2)
 * cell(2,1) cell (2,2)
 */

//give u have 3 row and 4 column

for (int row = 1; row <= 3; row++){
   // System.out.println("Row: " +i );

    for (int col = 1; col <= 4; col++){

    System.out.print("Cell(" + row + "," + col + ") " );
    }
    System.out.println();
}


/*System.out.print("Cell(" + 1 + ","+ 1 +") ");
System.out.print("Cell(" + 1 + ","+ 2 +") ");
System.out.print("Cell(" + 1 + ","+ 3 +") ");
System.out.print("Cell(" + 1 + ","+ 4 +") "); */





}    
}
