package week12;

public class StaticMethods {

    public int num = 10;
    public static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
        System.out.println("count = " + count);

    }
    public void instanceMethod(){
        System.out.println("InstanceMethod");
        System.out.println("count = " + count);
        System.out.println("num = " + num);
        System.out.println("hello from instance method");
    }

}
