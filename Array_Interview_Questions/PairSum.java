package Array_Interview_Questions;
import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Please fill the array : ");
        for(int i = 0 ; i < intArray.length ; i++){
            intArray[i] = sc.nextInt();
        }
        System.out.print("Please input the target sum : ");
        int target = sc.nextInt();
        int[] result = twoSum(intArray, target);
        System.out.println(Arrays.toString(result));
    }

    // Two Sum
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[] { i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
