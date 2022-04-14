package week08;

import java.util.Arrays;

public class A01_ArrayExample {
    public static void main(String[] args) {
        //declare and initialize an Array

        int code = 200;

        int[] codes = new int[8];

        System.out.println(Arrays.toString(codes));

        codes[0]=200; //first element of array
        codes[1]=201;

        System.out.println(Arrays.toString(codes));

        int[]statusCodes={200,201,204,400,401,403,404,500};

        System.out.println("-----------size of an array-----------");

        //string str = "Java" ; str.length()-----> size of the string

        //for arrays, length gets no paramater and returns an integer
        System.out.println("the size of array: "+statusCodes.length);

        int sizeOfArray = statusCodes.length;

        String [] responseTypes = new String[]{"OK", "Created", "No Content","Bad Request", "Unauthorized", "Forbidden", "Not Found", "Internal Server Error"};

        for (int i = 0; i < responseTypes.length; i++) {
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each Status Code means = " + text);
        }






    }
}
