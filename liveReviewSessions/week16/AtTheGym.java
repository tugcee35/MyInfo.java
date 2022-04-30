package week16;

public class AtTheGym {
    public static void main(String[] args) {

        //Exercise exercise = new Exercise() {


Running running = new Running();
Swimming swimming = new Swimming();
FreeWeight freeWeight = new FreeWeight();

//Exercise polyObject = new Running();
running.start();
running.perform();
        System.out.println("Running for 30 minutes-calories: "+running.getCaloriesCount(30));
swimming.start();
swimming.perform();
        System.out.println("Swimming for 30 minutes: "+ swimming.getCaloriesCount(30));



    }
}
