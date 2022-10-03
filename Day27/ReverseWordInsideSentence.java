package Day27;

import java.util.Arrays;

public class ReverseWordInsideSentence {
public static void main(String[] args) {

String str = "Cybertek Batch Spartan is the best";
String [] words = str.split(" ");
String reversedSentence = "";

for ( int j = 0; j < words.length; j++){
   //System.out.println(words[i]);


   String one = words[j];    // in each iteration this will be a new word
   char[] wordChars = one.toCharArray();   // this create char array for words
   int lastIndex = wordChars.length-1;

   for ( int i = 0; i < wordChars.length/2; i++){
    // create a temp char variable so we can temp store the value we want to
   
   char temp = wordChars[i];
   wordChars[i] = wordChars[lastIndex -i];
   wordChars[lastIndex-i] = temp;
   
   }
   // how to change char array to a string
   String reversed = new String(wordChars);

reversedSentence = reversedSentence + reversed + " ";
   //System.out.println(reversed);
}
System.out.println(reversedSentence);



/*String revString = "";

for ( int k = 0; k < cyberTek.length; k++){

String word = cyberTek[k];

String revWord = "";
for (int l = word.length()-1; l>=0; l--){
    revWord=revWord+word.charAt(l);
}
revString = revString+revWord+" ";
}
System.out.println();
System.out.println(revString); */





    
}
}
