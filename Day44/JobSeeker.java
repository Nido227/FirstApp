package Day44;

import java.util.*;

public class JobSeeker {
public static void main(String[] args) {

Job j1 = new Job();
Job j2 = new Job("Senior Sdet");
Job j3 = new Job("Scrum Master", "Oracle", 130000);
Job j4 = new Job("Sdet" , "Santander" , 125000);
Job j5 = new Job("Tester", "Google", 100000);
Job j6 = new Job("Programmer", "Apple", 2000000);

System.out.println(j1.getAnnualSalary());
System.out.println(j1.getTitle());

System.out.println(j1.toString());
System.out.println(j2.toString());
System.out.println(j3.toString());
System.out.println(j4.toString());
System.out.println(j5.toString());
// if we print out any reference variable directly, it will by default call toString()
System.out.println(j6);

List<Job> jobs = new ArrayList<>();
jobs.add(new Job("Programmer", "Apple", 2000000));
jobs.add(j1);
jobs.add(j2);
jobs.add(j3);
jobs.add(j4);
jobs.add(j5);

//System.out.println(jobs);
//System.out.println(jobs.get(0));
for (Job each : jobs) {
   System.out.println(each);
}
System.out.println("------------------");
for (int i = 0; i < jobs.size(); i++) {
    System.out.println(jobs.get(i));
}



}
}
