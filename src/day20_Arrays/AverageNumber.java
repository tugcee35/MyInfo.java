package day20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0; //+10+20+30...

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNumber = sum / numbers.length;
        //10/3 ==> 3

        System.out.println("averageNumber = " + averageNumber);

    }
}
/*
1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */

