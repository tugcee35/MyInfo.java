package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String Location = "";
        int groupNumber = 8;
        String teacher = "";

        if(grade >= 1 && grade <=6){

            if(grade == 1){
               Location = "Apple orchard";
               groupNumber=3;
               teacher = "Ms. Smith";
            }else if (grade ==2){
                Location = "Zoo";
                groupNumber=7;
                teacher="Mr.Lee";
            }else if(grade == 3){
                Location = "Aquarium";
                groupNumber=5;
                teacher="Ms.Wilson";
            }else if (grade == 4){
                Location="Movie Theather";
                groupNumber=2;
                teacher="Ms Reyes";
            }else if (grade==5){
                Location="Museum";
                groupNumber=5;
                teacher="Ms.Lela";
            }else if(grade==6){
                Location="Six Flags";
                groupNumber=8;
                teacher="Mr.Watt";
            }


        }else{
            System.out.println("İnvalid Grade");
        }

        System.out.println("location -"+Location+"\nnumber of groups - " +groupNumber+"\nteacher in charge -"+teacher);
        //System.out.println("number of groups -"+groupNumber);
        //System.out.println("teacher in charge -"+teacher);


    }
}
