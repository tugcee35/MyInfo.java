package week03;

public class AssignmentOperators {
    public static void main(String[] args) {

        int i = 100;
        System.out.println("i = " + i); //100

        i+=10;
        System.out.println("i = " + i); //110

        i-=10;
        System.out.println("i = " + i);//100

        i*=3;
        System.out.println("i = " + i); //300

        i/=4;
        System.out.println("i = " + i);//75

        i%=5; //re-assign i values changes each time
        System.out.println("i = " + i);//0

        String statement = "EU8";

        statement+="Great";

        System.out.println("statement = " + statement);

    }
}
