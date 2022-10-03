package Day55Abstraction;

public abstract class Employee {

    private int id;
    private String name;

    public Employee(){
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void calculateAnnualSalary();
    //can we make static method abstract
    //no because it can not be overriden

    //can we make final method abstract... NO
    //can we make private method abstract... NO
    public abstract boolean isIn100KClub();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  //  public abstract void calculateAnnualSalary();
    // {
    //     System.out.println("calculate yourself my child");
    // }
    
}
