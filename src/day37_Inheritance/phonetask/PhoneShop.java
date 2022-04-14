package day37_Inheritance.phonetask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone1 =new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung1 = new Samsung("Galaxy s19", "6 inches", 800, "White");

        Nokia nokia1 = new Nokia("Brick", "4 inches", 400, "Red");

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone1.call(911);
        iphone1.text(12345678);
        iphone1.faceTime(789654433);
        iphone1.faceTime("yahoo@gmail.com");

        System.out.println("-----------------------------------------");

        samsung1.call(911);
        samsung1.text(1234949409);
        samsung1.freeze();

        System.out.println("------------------------------------------");

        nokia1.call(3244545);
        nokia1.text(958857);
        nokia1.selfDefense();

    }

}
