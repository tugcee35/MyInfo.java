package week12;

public class ValueTest {
    public static void main(String[] args) {

        Value value = new Value();
        System.out.println(value.calledMethod);

        System.out.println(value.getVal());


        value.setValue(5);
        System.out.println(value.calledMethod);
        System.out.println(value.getVal());



        Value value1 = new Value(3);
        System.out.println(value1.constructor_called);
        System.out.println(value1.calledMethod);
        System.out.println(value1.getVal());


    }
}
