package Week02;

public class AritmeticOperators {
    public static void main(String[] args) {

/*
Division ;
in math 10/3 = 3.33333
in java 10/3 = 3 reason int/int = int;
10/3.0 int/double =double
10.0/3 double / int = double
 */
        System.out.println("10/3 : " + (10/3));
        System.out.println("10/3 : " + (10/3.0));
        System.out.println("10 + 3 : " +10+3); /// 10+3 =103 concatenation
    //string + int = string "10+3:" +10 ="10+3 : 10" ---- string+int=string
    // IMPORTANT : JAVA runs from top to button and left to right

    int num1 = 10;
    double num2 = 3.0;

    int result =(int) (num1/num2); //expicilit casting
        System.out.println("result = " + result);




}

    }