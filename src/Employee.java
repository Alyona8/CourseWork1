public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    private static int counter = 1;

    public Employee(String fullName, int department, double salary) {

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int dept) {
        department = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId() + ". " + getFullName() + " (" + getDepartment() + " отдел) " + getSalary() + " руб.";
    }
}
