package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Ali", 'F', 28, 110000);
        employee1.setAge(32);
        System.out.println(employee1);
        Employee employee2=new Employee("Aygun", 'M', 35, 190000);
        employee2.setName("Elivara");
        employee2.setSalary(employee2.getSalary()+1500);
        System.out.println(employee2);

    }
}
