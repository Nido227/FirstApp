package Day27;

import java.util.Arrays;

public class ArraysCopyOf {
public static void main(String[] args) {


String[] dcHeros = {"Superman", "Batman", "Aquaman","Wonder Woman", "The Flash","Green Lantern", "Vasyl"};

String[] herosCopied = new String[dcHeros.length];
for (int i = 0; i < herosCopied.length; i++) {
    herosCopied[i] = dcHeros[i];
}

System.out.println(Arrays.toString(herosCopied));

Arrays.sort(herosCopied);
System.out.println(Arrays.toString(herosCopied));
System.out.println(Arrays.toString(dcHeros));

for(String hero : dcHeros){
    if(hero.equals("Vasyl")){
        System.out.println("Bingo");
    }
}



}
}

