package week05;

public class ReverseUsingCharAtMethod {
    public static void main(String[] args) {

        String word = "madam";

        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));

        String reversedWord = "";
        reversedWord+=word.charAt(4); //reversedWord = reversedWord + word charAt(4)
        reversedWord+=word.charAt(3); //shorthand : +=word chartAt(3)
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else {
            System.out.println("The word is not Palindrome");
        }
    }
}
