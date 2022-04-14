package week06;

public class PrintAllLetters {
    public static void main(String[] args) {

        //print all the letter from A to Z
        // char A -- in ASCII table is values 65 , Z is 90
        // how can ı turn integer into char : explicitly casting
        for(int i = 65; i<= 90 ; i++){
            System.out.print((char) i+" ");
        }

        //chars are also iterable, same result
        System.out.println();
        for(char c = 'A'; c<= 'Z' ; c++){
            System.out.print(c+" ");
        }


        System.out.println();



    }
}
