package Week02;

public class CarInfo {
    public static void main(String[] args) {

        //give example of the car that you will buy after you find a well payed job
        //My dream
        int year = 2022;
        String make = "BMW";
        String model = "320M SPORT";
        //automatic = true ; mauel = false
        boolean transmission = true;
        String color = "Bronze";
        int milage = 0;
        int price = 100_000; // for europe :D

        System.out.println("My Dream Car");
        System.out.println(year+ " "+make+" "+model+"\nAutomatic Transmission :"+transmission);
        System.out.println(color+"|"+ milage+" kilometers|"+price+"Euro");

            //let's turn this value into TL 1 Euro = 15.5 TL

        double price1Tl = price * 15.5;
        double taxRate = 1.80; // for this kind of cars
        double priceAfterTaxInTL = price1Tl+(price1Tl+taxRate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

        //Variables are used, because it makes our data reusable and maintaintable

    }
}
