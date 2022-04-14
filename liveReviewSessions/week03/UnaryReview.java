package week03;

public class UnaryReview {
    public static void main(String[] args) {
        int a = 20;

        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);
        
        int b = 20;
        System.out.println("++b = " + ++b);

        int c = 20;
        System.out.println(++c + 1);

        System.out.println("------------------------");
        boolean isMarried = true;
        System.out.println("isMarried = " + !isMarried);

        System.out.println("----------------------------");
        int x = 12;

        if (++x>12){//pre
            System.out.println("x in the IF statement part: "+ x);
        }else{
            System.out.println("x value in the ELSE statement");
        }


        int y = 12;

        if (y++>12){//post
            System.out.println("y in the IF statement part: "+ y);
        }else{
            System.out.println("y value in the ELSE statement");
        }


    }
}
