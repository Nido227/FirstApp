package Day26;

import java.util.Arrays;

public class StringSplit {
public static void main(String[] args) {

String shows = "Spider-Man, X-Man, Family Guy, Breaking Bad";

String [] showsArray = shows.split(", ");
System.out.println(Arrays.toString(showsArray));
for ( int i = 0; i < showsArray.length; i++){
    System.out.println(showsArray[i]);
}
System.out.println(showsArray[0]);
System.out.println(showsArray[showsArray.length-1]);




}
}
