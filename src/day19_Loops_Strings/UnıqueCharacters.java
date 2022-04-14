package day19_Loops_Strings;

public class UnıqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";//bdf

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0; // represent the frequency of the  char

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);// each character of str
                if(ch == each){
                    count ++;
                }
            }

            if(count == 1){ // if the frequency of character is 1, than the character is unique
                result += ch;
            }
        }
        System.out.println(result);



    }
}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */