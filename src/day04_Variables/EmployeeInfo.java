package day04_Variables;

public class EmployeeInfo {

    /*
    1. name (String)
    2. age (int)
    3. gender (char)
    4. company (String)
    5. jobTitle (String)
    6. yearsOfExperience (double)
    7. salary (int)
    8. isFullTime (boolean)
    9. isMarried (boolean)
    10. EmployeeId (String)
    11. SSN (String)

     */

    public static void main(String[] args) {

    String name = "Tuğçe Emiroğlu";
    int age = 28;
    char gender = 'F';
    String company = "T&S";
    String jobTitle = "SDET";
    double yearsOfExperience = 3-5;
    int salary = 100_000;
    boolean isFullTime = true;
    boolean İsMarried = false;
    String EmployeedId = "1234543232";
    String SSN = "(123)45-45-9";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("EmployeedId = " + EmployeedId);
        System.out.println("SSN = " + SSN);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("İsMarried = " + İsMarried);


    }


}
