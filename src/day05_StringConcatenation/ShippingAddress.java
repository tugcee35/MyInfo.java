package day05_StringConcatenation;

public class ShippingAddress {

    public static void main(String[] args) {
       /*
       string name
       string buildingNumber
       string streetName
       string city
       string state
       string zipCode
        */
          String name = "James",
                 buildingNumber = "1123B",   //also int buildingNumber = 1123; like this
                 streetName = "Jones Branch Dr",
                 city = "McLean",
                 state = "VA",
                 zipCode = "22031A"; // we don't use int because of A-B special character

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

            String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " +  name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);

    }
}
