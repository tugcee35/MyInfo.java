package day23_CustomMethos_Void;

public class CustomMethosWithParameters {

    public static void main(String[] args) {
        //OddOrEven(); // the methos demaind additional info to complete its tas

        OddOrEven(10);

     }



    //create a function that can check if a number is odd number oR even number
    public static void OddOrEven(int number){
        if(number %2 == 0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }



    }


}
