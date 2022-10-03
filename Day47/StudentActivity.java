package Day47;
import static Day47.StudentsUtility.*;

public class StudentActivity {
    public static void main(String[] args) {
        StudentsUtility.displayAllStudent();

        StudentsUtility.addOneStudent("Jon Snow");
        StudentsUtility.addOneStudent("Mavlia");
        StudentsUtility.displayAllStudent();

        StudentsUtility.removeStudent(10);
        StudentsUtility.displayAllStudent();
    }
}
