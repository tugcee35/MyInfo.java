package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is  fun, I love learning Java";
        String str2 = str.replace("Java",  "Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
       email= email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton Phyton Phyton";
        String sentence2 = sentence.replace("Phyton", "");

        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("   ", " ");

        System.out.println("sentence2 = " + sentence2);


        String s ="Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2.replace(" C#", "Java");

        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a", "e");

        System.out.println(s3);

        System.out.println("------------------------");

        String result = "Java Java Java";
        result=result.replaceFirst("Java", "Python");

        System.out.println(result);
        String result2 = "C# is fun, C# is cool";

        result2 =result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        String result3= "Java";
        result3=result3.replaceFirst("va", "o");
        System.out.println(result3);




    }
}
