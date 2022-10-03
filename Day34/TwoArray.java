package Day34;
// ?????????????????
import java.util.Arrays;

public class TwoArray {
public static void main(String[] args) {


int[][] twoDArrObj = { {1,2,3,4}, {6,7,8,9,} };
//System.out.println(Arrays.deepToString(twoDArrObj));

//twoDPrinter(twoDArrObj);

int row=6,col=5;
int[][] tD = get2DArray(row, col);
System.out.println(Arrays.deepToString(tD));

}

public static void twoDPrinter(int[][] twoD) {
//System.out.println(Arrays.deepToString(twoD));
for (int[] eachArr : twoD) {
for (int eachNum : eachArr) {
    System.out.print(eachNum + " ");
}
System.out.println();
}
}

public static int[][] get2DArray(int row, int col) {
    int[][] twoDArr = new int[row][col];

    twoDArr[0][0]=2;
    //System.out.println(Arrays.deepToString(twoDArr));
    for (int i = 1; i <= row; i++) {
    
        //System.out.println("Row num: " + i);
        for (int j = 1; j <= col; j++ ) {
    
           // System.out.print("Col num: " + j + " | ");
           twoDArr[i-1][j-1]=j;
        } 
        //System.out.println();
    }
    return twoDArr;
}




}
