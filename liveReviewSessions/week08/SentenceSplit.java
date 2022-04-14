package week08;

public class SentenceSplit {
    public static void main(String[] args) {

        String searchResult = "1-16 of  829 result for ipad";

        // in my test cases I want to verify that my search result comes 829

        // Break time task : capture the amount 790 with split method
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);
        String amount = confirmation.split("\n")[1].split("")[1];
        System.out.println("amount = " + amount);


    }
}
