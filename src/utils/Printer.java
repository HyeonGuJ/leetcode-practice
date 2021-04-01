package utils;

public class Printer {

    public static void print(int[] nums) {
        if (nums == null) {
            System.out.println("void array");
        }
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(" ," + nums[i]);
        }
        System.out.println();

    }

}
