package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

       String password = "cLdeo1990@";

       int countUpperCase = 0 ;
       int countLowerCase = 0;
       int countDigits = 0 ;
       int countCSpecialChar = 0;

       for(int i = 0 ; i < password.length(); i++) {
           char each = password.charAt(i);

           if (Character.isUpperCase(each)) {
               countUpperCase++;
           } else if (Character.isLowerCase(each)) {
               countLowerCase++;
           } else if (Character.isDigit(each)) {
               countDigits++;
           } else {
               countCSpecialChar++;
           }

       }

       /*
        System.out.println("countUpperCase = " + countUpperCase);

        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countCSpecialChar = " + countCSpecialChar);
 */
        boolean hasupperCase = countUpperCase > 0 ;
        boolean hasLowercase = countLowerCase > 0 ;
        boolean hasDigit = countDigits > 0 ;
        boolean hasSpecialChar = countCSpecialChar > 0 ;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasSpecialChar && hasLowercase && hasupperCase && hasDigit;


        System.out.println("strongPassword = " + strongPassword);




    }
}
