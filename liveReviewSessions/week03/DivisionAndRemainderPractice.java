package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {

        int Seconds=4000;
        int hours,minutes,seconds;


        seconds = Seconds%60;
        minutes = (Seconds/60) % 60;
        hours = Seconds / 3600;

        String clock = "Hours :" +hours+" Minutes :" +minutes+" Seconds :"+seconds;

        System.out.println("clock = " + clock);

    }
}
