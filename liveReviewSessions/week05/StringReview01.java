package week05;

public class StringReview01 {
    public static void main(String[] args) {


        String str1 = "Java"; //literal way of creating

        String str2 = "Java";// literal way of creating

        System.out.println(str1 == str2);//true

        String str3 = new String("Java");
        System.out.println(str1 == str3);//false

        System.out.println((str1.equals(str3)));//true

        String str4 = new String("JAVA");
        System.out.println(str2.equalsIgnoreCase(str4)); //true

    }
}
