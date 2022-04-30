package week16;

public abstract class Exercise {

public void start(){
    System.out.println("warmin up and starting the exercise");
}

//abstract method : no body, no implementation, sub classes will ***OVERRİDE***

public abstract void perform();

public abstract int getCaloriesCount(int minutes);



}
