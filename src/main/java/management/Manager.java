package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String insuranceNumber, double salary, String deptName) {
        super(name, insuranceNumber, salary);
            this.deptName = deptName;

    }


    public String getDepartment() {
        return this.deptName;
    }
}
