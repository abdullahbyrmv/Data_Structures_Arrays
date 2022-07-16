package Classic_Array_Questions;
import java.util.Scanner;

public class Pair_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Please fill the array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Please enter the target sum : ");
        int target_sum = sc.nextInt();
        String res = pairSum(array,target_sum);
        System.out.println(res);
    }

    public static String pairSum(int[] myArray, int sum) {
        String result = "";
        for(int i=0; i<myArray.length; i++) {
            for(int j=i+1; j<myArray.length; j++) {
                if (myArray[i]+myArray[j]==sum) {
                    result += myArray[i]+":"+myArray[j]+" ";
                }
            }
        }
        return result;
    }
}
