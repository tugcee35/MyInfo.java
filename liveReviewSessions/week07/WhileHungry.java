package week07;

public class WhileHungry {
    public static void main(String[] args) {

        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
 /*
        while(isHungry){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C " +bananas);
            //unicodes : ""
            //condition that will change the boolean to false
            if(bananas == countToFull){
                isHungry = false;
            }
        }

        System.out.println("Had enough bananas, let's get back study");
*/

while(true){
    if(bananas == countToFull){
        break;
    }
    bananas++;
    System.out.println("Eating a banana: \uD83C\uDF4C " +bananas);
}
        System.out.println("Had enough bananas, let's get back study");



    }
}
