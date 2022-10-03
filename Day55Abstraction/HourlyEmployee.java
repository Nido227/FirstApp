package Day55Abstraction;

import java.time.Month;

public class HourlyEmployee extends Employee{
    
    // int id;
    // String name;
    private int MonthlyHourWorked;
    private int hourlyRate;

    public HourlyEmployee(int id, String name, int monthlyHourWorked, int hourlyRate) {
        super(id, name);
        MonthlyHourWorked = monthlyHourWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public int getMonthlyHourWorked() {
        return MonthlyHourWorked;
    }
    
    public void setMonthlyHourWorked(int monthlyHourWorked) {
        MonthlyHourWorked = monthlyHourWorked;
    }
    
    public int getHourlyRate() {
        return hourlyRate;
    }

    
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [MonthlyHourWorked=" + MonthlyHourWorked + ", hourlyRate=" + hourlyRate + "]";
    }

    @Override
    public void calculateAnnualSalary(){
        int annual = MonthlyHourWorked * hourlyRate * 12;
        System.out.println("Annual salary is: " + annual);
    }

    @Override
    public boolean isIn100KClub() {
        int annual = MonthlyHourWorked * hourlyRate * 12;
        return annual>1000000;
    }

}
