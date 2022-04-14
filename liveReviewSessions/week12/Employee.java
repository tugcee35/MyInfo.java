package week12;

public class Employee {

    public String name, jobTtitle;
    public int ID;
    public double Salary;

    public Employee(String name, String jobTtitle, int ID, double salary) {
        this.name = name;
        this.jobTtitle = jobTtitle;
        this.ID = ID;
        Salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTtitle='" + jobTtitle + '\'' +
                ", ID=" + ID +
                ", Salary=" + Salary +
                '}';
    }
}
