package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int n = 5;

       String name= (n==1)? "Jan" :(n==2)? "Feb" :(n==3)? "March" :(n==4)? "April" :(n==5)? "May" :(n==6)? "June"
                :(n==7)? "July" :(n==8)? "Agust" :(n==9)? "September" :(n==10)? "October" :(n==11)?"Nov" : "Dec";

        System.out.println(name);

    }
}
