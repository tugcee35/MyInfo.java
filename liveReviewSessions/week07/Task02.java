package week07;

public class Task02 {
    public static void main(String[] args) {


        for (int i = 1; i <= 6; i++) { //handles rows
            for (int j = 1; j <=i ; j++) { //handles columns

                System.out.print(j%2==0? 0 : 1);

            }
            System.out.println();
        }
        /*
        1
        10
        101
        1010
        10101
        101010
         */
    }
}
