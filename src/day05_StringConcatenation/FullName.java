package day05_StringConcatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Tuğçe";
        String lastName = "Emiroğlu";
        String fullName = firstName + " " + lastName;
        int age = 28;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        System.out.println(fullName);

    //Full name of the person is ____
        System.out.println("Full name of the person is " + fullName);

    //___ is ___ years old
        System.out.println(fullName + " is " + age +" years old.");

    //Fullname is JobTitle +, he works at + CompanyName, and FullName's salary is Salary

        System.out.println(fullName + " is " + jobTitle +" , she works at " + companyName + " and " + fullName + "'s " + " salary is $" + salary);
    }

}
