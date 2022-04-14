package week12;

public class TelephoneTest {

    public static void main(String[] args) {

      //  System.out.println(Telephone.total);

        Telephone telephone = new Telephone();

        System.out.println(telephone.total);
        telephone.setNumber("555-5055500");
        System.out.println(telephone.getNumber());


    }

}
