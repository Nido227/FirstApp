package Day22;

public class LookingForWordInSentence {
public static void main(String[] args) {
            //0123456789012
String str = "java kava ava";
String target = "ava";

int firstIndex = str.indexOf(target);
int lastIndex = str.lastIndexOf(target);

int index = -1;

while(index<=lastIndex){
    index = str.indexOf(target, index);
    System.out.println("Found at: "+index);
    index = index +1;
}



}    
}
