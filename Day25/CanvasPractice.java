package Day25;

public class CanvasPractice {
public static void main(String[] args) {

String[] courses = {
    "Welcome Kit",
    "Online-Java Programming",
    "Online-Software Developement Lifecycle",
    "Online-Software QA Testing",
    "Online-Team Activity",
    "Online-Menotoring",
    "Online-Selenium",
    "Online-SQL",
    "Online-API Testing"
};

int[] courseId = {143,166,168,170,163,203,169,171,164};

//use above teo array to generate below messages
// The course id for <Welcome Kit> is <143>
for( int i = 0; i < courses.length; i++)
System.out.println("The course is for <" + courses[i] + "> is <" + courseId[i] + ">");


}
}
