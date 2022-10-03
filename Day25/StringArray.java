package Day25;

import java.util.Arrays;

public class StringArray {

public static void main(String[] args) {
    
// create a string array of capacity 4
// put ur favorite movie in
String [] movies = new String[4];
movies[0] = "Hang Over";
movies[1] = "Spider-Man";
movies[2] = "Grow Ups";
movies[3] = "Up";

//1, first use loop to print them out
for( int i = 0; i < 4; i++){
}
System.out.println(Arrays.toString(movies));

//2, print the length of all items
System.out.println(movies.length); //getting char count of STRING

System.out.println(movies[0].length());  //getting character count of movie[0]
for( int i = 0; i < movies.length; i++){
    System.out.println(movies[i] + ": Character count = " + movies[i].length());
}

//3, get the max length movie title
int max = movies[0].length();
for( int i = 0; i < movies.length; i++){
    if(movies[i].length() > max){
        max = movies[i].length();
    }
}
System.out.println(max); //lets add movie title as well




}
}
