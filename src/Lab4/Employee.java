package Lab4;

public class Employee implements Rules {
    public String name;
    public double salary;

    /**
     * constructor for employee
     *
     * @param inName   - Employee name
     * @param inSalary - Employee salary
     */
    public Employee(String inName, double inSalary) {
        name = inName;
        salary = inSalary;
    }

    /**
     * default constructor for an Employee
     */
    public Employee() {
        name = "No Name";
        salary = 0;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @return info about the employee
     */
    public String toString() {
        String EmployeeInfo = name + "'s salary is " + salary + ".";
        return EmployeeInfo;
    }

    /**
     * set the name
     *
     * @param name - name to be set for employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set the salary to the employee
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
