package day14_String;

public class EmailTask1 {
    public static void main(String[] args) {

        String email= "mike_tyson@gmail.com";
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        email= lastName + "_" + firstName + rest;
        System.out.println(email);
    }
}
