package Day34;

public class VarArgs2 {
public static void main(String[] args) {

printNames("Zukra", "Nido", "Yaha", "Yulk");
printNames("Mariam", "Ameria", "Hadice");
printNames();
printNames(null, "not empty", "");

String sentence = sentenceBuilder("Hello", "my", "name", "is");
String word = wordBuilder("Helloi", "my", "name", "is");

System.out.println(sentence);
System.out.println(word);
}


public static void printNames(String... names) {
// names are treated as String[] that have 
// whatever variable numbers of arguments from method call
//System.out.println(names[0]);
//System.out.println(names[3]);
System.out.println("You passed " + names.length + " arguments");
}

public static String sentenceBuilder(String... words) {
String sentence = "";
for (String str : words) {
    sentence += str + " ";

}
return sentence;
}

public static String wordBuilder(String... values) {
String concatenation = "";
int i = 0;
for (String s : values) {
concatenation += "" + values[i].charAt(values[i].length()-1);
}
return concatenation;
} 



}