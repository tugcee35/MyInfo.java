package day04_Variables;

public class Currencies {

    public static void main(String[] args) {
        // $1000
       int dollar = 1000;

        double lira = dollar * 13.45 ;
        double euro = dollar * 0.88 ;
        //jpy, pound, peso, cad, riyal, rub ......
        double jpy = dollar * 114.57;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.25;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("CAD = " + CAD);

    }


}
