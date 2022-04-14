package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Grey", 123456);

        Tesla tesla = new Tesla("Model S", 2020, 40000, "Black", 585858);

        BMW bmw = new BMW("XS", 2022, 90000, "Red", 10000);


        toyota.start();
        tesla.start();
        bmw.start();




    }
}
