package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                      19 >= 18 && "UK" == "USA"
        //                      true     &&  false ==> false
        //                      14 >= 18 && "USA"== "USA"
        //                      false    &&  true ==> false

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 4000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000;

        System.out.println(name2+ " is eligible for loan : " +isEligible2);

        System.out.println("------------------------------------------");

        String name3 ="Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                      21 >= 18 && ( 'F' == 'M' ||  'F' == 'F')
        //                         true  && ( false      ||   true)
        //                         true  &&    true
        //                          true

        System.out.println(name3+ " is eligible to register: "+isEligible3);

        System.out.println("-------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUsCitizen == true;

        System.out.println(name4 +" is eligible to apply for US citizenship: " +isEligible4);


        System.out.println("---------------------------------------");

        String student = "Anna";
        double qpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = qpa >= 3.5 || familyIncome <= 6000;
        //                      true  ||      true


        System.out.println(student + " is eligible for scholarship: " + isEligible5);


        System.out.println("-----------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------");

        int score = 85;
        boolean passed = score >= 68;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);




    }
}
