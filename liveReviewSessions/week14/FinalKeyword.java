package week14;

public class FinalKeyword {

   final int b;
   final static int c;


   public FinalKeyword(int b){
       this.b=b;
   }

   static {
       c=5;
   }

    public static void main(String[] args) {

        final int a;
        a=100;
        System.out.println(a);
    }
}
