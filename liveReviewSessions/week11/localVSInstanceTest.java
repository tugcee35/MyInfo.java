package week11;

public class localVSInstanceTest {
    public static void main(String[] args) {

        LocalVSInstance obj = new LocalVSInstance();
        System.out.println("--coming from the method---");
        obj.showDifference();

        System.out.println("--coming from instance variable----");
        System.out.println(obj.a);
        obj.a = 1;
        System.out.println(obj.a);
    }
}
