package day15_ForLoops;

public class StringMethods {
    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);

        String str2 = "Cydeo     ";
        System.out.println(str2.isBlank());

        System.out.println("-------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));

        System.out.println("yEs".equals("Yes"));
        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("-------------------------");

        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("----------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input2.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false

        System.out.println(input1.contains("Java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("-----------------");
        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");

        System.out.println(x);
        System.out.println(y);

    }
}
