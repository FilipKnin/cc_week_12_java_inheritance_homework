package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String insuranceNumber, double salary, String deptName, double budget) {
        super(name, insuranceNumber, salary, deptName);
        this.budget = budget;

    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus(){
        return getSalary() * 0.02;
    }
}
