package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split(Yes or No)?");
        String YesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numOfPeople = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scan.next().toLowerCase();

        double tipRate=(service.equals("execellent"))? 0.25 :(service.equals("Great"))? 0.20 : (service.equals("Good"))? 0.15
                :(service.equals("Fair")? 0.01 : 0.05);

        double totalTip = amount * tipRate;

        System.out.println("numOfPeople = " + numOfPeople);
        System.out.println("Total to pay = " + amount);
        System.out.println("totalTip = " + totalTip);

        if(YesOrNo.equals("yes")){
            System.out.println("Total per person: "+ (amount/numOfPeople));
            System.out.println("Tip per person: " + (totalTip/numOfPeople));
        }
        scan.close();
    }
}
