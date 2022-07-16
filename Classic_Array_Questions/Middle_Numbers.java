package Classic_Array_Questions;
import java.util.Arrays;
import java.util.Scanner;

public class Middle_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Please fill the array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] newarr = middle(array);
        for(int i = 0 ; i < newarr.length ; i++){
            System.out.print(newarr[i] + " ");
        }
    }

    public static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }
}
