package week16;

public abstract class Exercise {


    double weight;
    public Exercise (double weight){
        this.weight=weight;
    }
public void start(){
    System.out.println("warmin up and starting the exercise");
}

//abstract method : no body, no implementation, sub classes will ***OVERRİDE***

abstract void perform();

abstract int getCaloriesCount(int minutes);



}
