package week04;

public class VendindNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = "chips";

        if(selection == "drink"){
            System.out.println("drink option is selected");
            if(snackItem== "tea"){
                System.out.println("Tea item selected");
            }
        }else if(selection == "Snack"){
            System.out.println("Snack option is selected");
            if(snackItem == "chips"){
                System.out.println("Chips is selected");
            }else if(snackItem=="candy"){
                System.out.println("Candy is selected");
            }
        }else{
            System.err.println("Invalid Entry");
        }

        System.out.println("--------------------");

        if(true)
            System.out.println("Hello");
            System.out.println("Running");



    }
}
