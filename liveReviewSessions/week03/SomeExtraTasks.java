package week03;

public class SomeExtraTasks {
    public static void main(String[] args) {
        int b = 2;

        boolean res = ++b == 2 || --b == 2 && --b == 2;
                    //  b:3(false)   2 == 2 (true)
        System.out.println(res);
    }
}
