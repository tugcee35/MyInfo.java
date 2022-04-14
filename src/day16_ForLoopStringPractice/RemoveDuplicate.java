package day16_ForLoopStringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbcc";
        //abc
        String result="";

        for (int i = 0; i <= str.length()-1 ; i++) {
            String ch = ""+str.charAt(i); // represent each character of str

            if(!result.contains(ch)){
                result += ch;
            }
        }

        System.out.println("result = " + result);



    }
}
