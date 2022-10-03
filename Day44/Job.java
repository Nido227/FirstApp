package Day44;

public class Job {

private String title;
private String company;
private double annualSalary;

public Job(){
    System.out.println("Message from: Job()");
    title = "undefined";
    company = "unknown";

}

public Job(String title){
    System.out.println("Message from: Job(String title)");
    this.title = title;

}

public Job(String title, String compnay, double annualSalary){
    System.out.println("Message from: Job(String title, String company, long annualSalary)");
    this.title = title;
    this.company = company;
    this.annualSalary = annualSalary;
}

//this is the special method that will be called when reference variable print out directly
// and method header hould exactly as below
// toString, does not accept parameter and return String
// public String toString(){
//     String allFields = "Title: " + this.title + " Company: " 
//                         + this.company + " + Annual Salary: " + this.annualSalary;
//     return allFields;
// }

public String toString() {
    return "Job [annualSalary=" + annualSalary + ", company=" + company + ", title=" + title + "]";
}




public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}
public String getCompany() {
    return company;
}
public void setCompany(String company) {
    this.company = company;
}
public double getAnnualSalary() {
    return annualSalary;
}
public void setAnnualSalary(long annualSalary) {
    this.annualSalary = annualSalary;
}







}
