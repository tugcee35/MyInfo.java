package week16;

public class FreeWeight extends Lifting{


    @Override
    public void perform() {
        System.out.println("Lifting Free Weight with dumbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*6;
    }

    public void endLift(){
        System.out.println("Carefully re-rack dumbells");
    }
}
