package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch ='@';

        if(ch >= '0' && ch <= '9'){
            System.out.println("Degit");
        }else if( (ch>= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special Character");
        }

        System.out.println("---------");

        //Also you can write with ASCII table

        char chr = 65;

        if(chr >= 48 && ch <= 57){
            System.out.println("Digit");
        }else if((ch >= 65 && ch<= 90 || ch >= 97 && ch <= 122)){
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special character");
        }


    }
}
