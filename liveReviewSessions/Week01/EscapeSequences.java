package Week01;

public class EscapeSequences {

    public static void main(String[] args) {

        /*
        \t : tab
        \n: takes it to next line
        \\ : prints \
        \" : prints "
         */

        System.out.println("Learn\tJava\n\tthe\nHard\tWay\n\n"); //   \H : illegal escape squence

        System.out.println("\tLearn JAVA the \" EASY WAY \" Way! \n\t\t With Oscar \\\\");


    }
}