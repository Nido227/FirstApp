package Day25;

import java.util.Arrays;

public class GetTheStringItemWithMaxLength {
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
System.out.println(movies.length); //getting character count

System.out.println(movies[0].length());
for( int i = 0; i < movies.length; i++){
    System.out.println(movies[i] + ": Character count = " + movies[i].length());
}

//3, get the max length movie title
int max = movies[0].length();
//get location of the word with max length
//use index to get the word
int index = 0;
for( int i = 0; i < movies.length; i++){
    if(movies[i].length() > max){
        max = movies[i].length();
        index = i;
    }
}
System.out.println(index); //lets add movie title as well
System.out.println("The name of the longest movie is: " + movies[index] + " and it is located at index: " + index);








}
}
