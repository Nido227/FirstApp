package Day33;

public class GraderApp {
public static void main(String[] args) {

// Grade your score by range and receieve grade of A B C F
System.out.println(gradeTheScore(99));
System.out.println(gradeTheScore(89));
System.out.println(gradeTheScore(79));
System.out.println(gradeTheScore(9));


}

public static char gradeTheScore(int score){

if ( score <=100 &&score >=90)
    return 'A';
if ( score <=100 &&score >=90)
    return 'B';
if ( score <=100 &&score >=90)
    return 'C';
    return 'F'; 
}


/* if ( score <=100 &&score >=90){
    return 'A';
}else if ( score <=90 &&score >=80){
    return 'B';   
}else if ( score <=80 &&score >=70){
    return 'C';
} else {
    return 'F';  */
}
