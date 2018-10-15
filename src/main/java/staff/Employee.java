package staff;

public abstract class Employee {

    private String name;
    private String insuranceNumber;
    private double salary;

    public Employee(String name, String insuranceNumber, double salary) {
        this.name = name;
        this.insuranceNumber = insuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            double raisedSalary = this.salary + amount;
            this.salary = raisedSalary;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
