package week12;

public class StaticTest {

    public String instanceValue = "Selenium";

    public static String word = "Java";

    public static void main(String[] args) {

        System.out.println("word = " + word);

        StaticMethods.displayMessage("Hello static function");
        StaticMethods object = new StaticMethods();
        object.displayMessage("Hello, I am using object to call you");

        System.out.println(StaticMethods.count);
        System.out.println(object.count);

        StaticMethods object2 = new StaticMethods();
        System.out.println(object2.num);
        object2.count=15;


        System.out.println(object.count);

        object.num = 3;
        object2.num =4;

        object.instanceMethod();
        object2.instanceMethod();


    }
}
