package Day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TextFileToList {
public static void main(String[] args) {

List<String> lineLst = getTextFileAsList("C:/Users/Nido/Desktop/FirstApp/Day39/hero.txt");  //hero.txt
String fullPath = "C:/Users/Nido/Desktop/FirstApp/Day39/hero2.txt";

List<String> lineLst2 = getTextFileAsList(fullPath);
System.out.println(lineLst2);
System.out.println(lineLst);
System.out.println(lineLst.size());

// xls  doc  ppt  pdf
String s = "erat_quisque_erat.xls";
// how do we get file extension
String fileExtension = s.substring(s.indexOf(".")+ 1);
System.out.println(fileExtension);


//getting the .xls count in the text file
int count = 0;
for (String each : lineLst) {
    if(each.endsWith(".xls")){
        count++;
    }
}
System.out.println("XLS Count is: " + count);


//Task2, find out the longest file name
String longest = lineLst.get(0);
for (String each : lineLst) {
    if(each.length() > longest.length()){
        longest = each;
    }
}
System.out.println("Longest file name is: " + longest);

//Task 3, find out the longest xls file name
String longestExcel = "";

for (String each : lineLst) {
if(each.endsWith(".xls") && each.length() > longestExcel.length()){
    longestExcel = each;
}

}
System.out.println("Longest XLS file name is: " + longestExcel);
}




public static List<String> getTextFileAsList(String filePath) {
List<String> allLines = null;
try{
    allLines = Files.readAllLines(Paths.get(filePath));
} catch (Exception e) {
    System.out.println("Wrong file path probably");
}
return allLines;
}


}

