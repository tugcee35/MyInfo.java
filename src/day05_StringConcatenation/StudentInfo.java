package day05_StringConcatenation;

public class StudentInfo {
    public static void main(String[] args) {
        /*
        2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
         */
        String student_name = "Tuğçe" ;
        int age = 28;
        char gender = 'F';
        String school_name = "CYDEO";
        String phone_number = "(232)949-494-44";
        boolean full_time = true;
        double GPA = 2.5;


        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("phone_number = " + phone_number);
        System.out.println("full_time = " + full_time);
        System.out.println("GPA = " + GPA);



    }
}
