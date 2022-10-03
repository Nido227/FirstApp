package Day28;

public class ExcelVisual {
public static void main(String[] args) {

int[][] data = {  {2,14,3} , {4,5} , {9}  };

//System.out.println( "data["+0+"]["+0+"] = " + data[0][0]);

for (int i = 0; i < data.length; i++) {

    for (int j = 0; j < data[i].length; j++) {
        System.out.print("data[" + i + "][" + j + "] = " + data[i][j] +" |");
    }
System.out.println();
}

}
}
