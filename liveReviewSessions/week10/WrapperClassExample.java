package week10;

public class WrapperClassExample {
    public static void main(String[] args) {
        int i1 =100;

        Integer i2 = i1; //auto-boxing

        Long i3 =(long)i1;

        Integer n1  =300;

        int n2=n1; //un-boxing

        String str ="123";
        System.out.println(str+1);

        int num = Integer.parseInt(str);
        System.out.println(num+1);

        String price = "$27.16";
        price = price.substring(1);

        double priceInDouble = Double.parseDouble(price);

        System.out.println(priceInDouble);

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2+1);

        char ch = 'a';
        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);
        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        String strTwo = "a1b2c3";

        int sumOfDigits = 0 ;

        for(char each : strTwo.toCharArray()){
            if(Character.isDigit(each)){
                sumOfDigits+= Integer.parseInt(each+"");
            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits);


        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

        String letter = "";
        String upperCaseLetters = "";
        String lowerCaseLetters ="";
        String digits = "";
        String specialChars ="";

        for(char each : strThree.toCharArray()){
            if(Character.isLetter(each)){
                letter += each;
                if(Character.isUpperCase(each)){
                    upperCaseLetters+=each;
                }else{
                    lowerCaseLetters+=each;
                }
            }else if(Character.isDigit(each)){
                digits+= each;
            }else{
                specialChars += each;
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("upperCaseLetters = " + upperCaseLetters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
