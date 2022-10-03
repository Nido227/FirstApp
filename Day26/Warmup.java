package Day26;
import java.util.Arrays;
public class Warmup {
public static void main(String[] args) {

/*  3 ways to Create an Array
*
*
*/

String names[] = new String[5];
names[0] = "abc";
names[1] = "ef";
names[2] = "gh";
System.out.println(Arrays.toString(names));


String[] names2 = new String[] {"aaa", "bbb", null, "ccc"};
System.out.println(Arrays.toString(names2));

int x = 0;
while(x< names2.length) {
System.out.println(names2[x]);
x++;
}

String[] names3 = {"ABC", "DEF"};
System.out.println(Arrays.toString(names3));








}
}