package Day35;

public class WarmUp {
public static void main(String[] args) {

String[] names = {"abd", "c", "hhellooo"};
System.out.println(findLongestWord("odiljan", "suleyman", "nido", "talmurat"));
} 

public static String findLongestWord(String... words) {
String longestWord = words[0];

for (String name : words) {
    if(name.length() >= longestWord.length()){
    longestWord = name;
}
}
return longestWord;
}


}
