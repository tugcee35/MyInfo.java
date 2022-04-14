package day30_CustumClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        Employee employee2 = new Employee();

        Employee employee3 = new Employee();

        Employee employee4 = new Employee();

        Employee employee5 = new Employee();

    employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);
    employee2.setInfo("Ali", 'M', 37, 5545,"QA", 3000,true);
    employee3.setInfo("Tugce", 'F', 28, 4354, "SDET", 900000, true);
    employee4.setInfo("Ayşe", 'F', 35, 5454, "SDET", 50000, false);
    employee5.setInfo("Aycan", 'F', 30, 34343, "SDET", 34555, false);

    Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

    int countFullTime = 0;
    int countPartTime = 0;
    double max = employees[0].salary;
    double min = employees[0].salary;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(employee.salary>max){
                max = employee.salary;
            }
            if(employee.salary<min){
                min = employee.salary;
            }
        }
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}
