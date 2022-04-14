package day24_CustomMethods_Return;

public class ReturnMethodPracitce {
    public static void main(String[] args) {

    int MaxNumber = max(100, 200);
        System.out.println(MaxNumber);
        System.out.println("---------------");
    int multiplication = MaxNumber*2;
        System.out.println(multiplication);
    }

    public static int max(int a, int b){
        int result = 0;
        if(a>b){
            result = a;
        }else{
            result =b;
        }
        return result;
    }



}
