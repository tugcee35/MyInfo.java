package day27_WrapperClasses;

import java.util.Arrays;

public class replace {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        replace(arr,2,30);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------");

        String[] arr2 = {"Java", "Python", "C++", "Ruby"};

        arr2 = replace(arr2, 2, "C#");

        System.out.println(Arrays.toString(arr2));
    }


public static int[] replace (int[] array, int index, int newElemenet){
    if(index<0 || index> array.length-1){
        System.err.println("Invalid Index: "+ index);
        System.exit(0);
    }
    array[index] = newElemenet;
        return array;
}
    public static double[] replace(double[] array, int index, double newElemenet){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElemenet;
        return array;
    }
    public static char[] replace(char[] array, int index, char newElemenet){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElemenet;
        return array;
    }
    public static String[] replace(String[] array, int index, String newElemenet){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        array[index] = newElemenet;
        return array;
    }

}
/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}

 */