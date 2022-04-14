package week11;

public class LocalVSInstance {

    public int a = 4;

    public void showDifference(){    // Ques= I want to be able to change this a as well
        int a = 5;  // this a is local to the method
        System.out.println(a);
    }


}
