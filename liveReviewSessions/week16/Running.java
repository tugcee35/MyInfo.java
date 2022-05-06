package week16;

public class Running extends Exercise{

    public Running(double weight){
        super(weight);
    }
    @Override
    public void perform() {
        System.out.println("Performing Runnin Exercise on the Track");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int) (minutes*13*(weight/100));
    }

    //public abstract void run();



}
