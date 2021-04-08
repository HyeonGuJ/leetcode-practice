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

    public static void print(String[] arr) {
        if (arr == null) {
            System.out.println("void array");
        }
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println();

    }

    public static void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            print(arr[i]);
        }
    }
}
