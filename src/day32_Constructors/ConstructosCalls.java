package day32_Constructors;

public class ConstructosCalls {

    public ConstructosCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructosCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public  ConstructosCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructosCalls obj1 = new ConstructosCalls();

        System.out.println("--------------------------");

        ConstructosCalls obj2 = new ConstructosCalls(10);

        System.out.println("---------------------------");

        ConstructosCalls obj3 = new ConstructosCalls("Java");

    }

}
