package week12;

public class MicrosoftCompany {

    public static void main(String[] args) {

        String[] arr = {"ab", "cv", "ed"};

        Employee employee1 = new Employee("Emir", "Product Owner", 100, 90000);
        System.out.println(employee1.toString());



        Employee[] testers = {
          new Employee("Yasin", "SDET", 123, 1500000),
          new Employee("Tuğçe", "QA Lead", 213, 300000),
          new Employee("Erol", "QA", 034, 100000),
          new Employee("Dilek", "SDET", 132, 1020000),
        };

        double maxSalary = Double.MIN_VALUE;
        for(Employee each : testers){
            System.out.println(each.toString());
            if(each.Salary > maxSalary){
                maxSalary = each.Salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

        System.out.println(testers[0].name);

    }
}
