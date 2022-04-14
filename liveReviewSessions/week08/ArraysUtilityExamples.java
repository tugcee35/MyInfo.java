package week08;

import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {
        int [] nums ={5, 10,4,1000};

        Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = "+ Arrays.toString(nums));

        int[] numsTwo={4, 5, 10, 35, 1000};

        int [] numsThree = nums;

        System.out.println("Arrays.equals(numsTwo) ="+Arrays.equals(nums, numsTwo));

        System.out.println(nums == numsTwo); //false

        System.out.println(nums = numsThree ); // true
        System.out.println(Arrays.equals(nums,numsThree));

        nums[0]=5000;
        System.out.println(Arrays.toString(numsThree));


        //copy method

        int[]numsFour = Arrays.copyOf(nums, nums.length);
        nums [0] = 3000;
        System.out.println(Arrays.toString(numsFour));



    }
}
