package Day28;

import java.util.Arrays;

public class TwoDArray {
public static void main(String[] args) {

// 2 DIMENSTIONAL ARRAY CAN BE VISUALIZED AS EXCEL SHEET
// WHICH HAS ROWS AND COLUMNS

    
int [][] table = new int[4][2];   // 4 ROW 2 COLUMN

table[0][0] = 12;
table[0][1] = 17;
table[1][0] = 3;
table[1][1] = 40;
table[2][0] = 44;
table[2][1] = 27;
table[3][0] = 23;
table[3][1] = 12;

for (int[] rows : table) {
    for (int cell  : rows) {
        System.out.print( cell + " " );
    }
    System.out.println();
}

for (int i = 0; i < table.length; i++) {
    
   // int[] eachRow = table[i];
   // System.out.println(Arrays.toString(eachRow));
for(int j = 0; j < table[i].length; j++){
    System.out.print(table[i][j]+" ");
}
System.out.println();
}


// loop through this 2D array to print out all the values

// Ways to make 2D arrays
int [][] data2 = new int[2][4];
int [] data3 [] = new int[2][4];
int data4 [][] = new int[2][2];




}
}
