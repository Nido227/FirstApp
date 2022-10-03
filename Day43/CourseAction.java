package Day43;

public class CourseAction {
public static void main(String[] args) {

Course java = new Course();
System.out.println(java.name);
System.out.println(java.courseID);


Course selenium = new Course();
Course softSkillCourse = new Course();

Course sql = new Course("sql");
System.out.println(sql.name);

Course prep = new Course("interview" , 1122);
System.out.println(prep.name);
System.out.println(prep.courseID);


}
}
