package Classic_Array_Questions;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Best_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        Integer[] array = new Integer[size];
        System.out.print("Please fill the array : ");
        for(int i = 0 ; i < array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(firstSecond(array));
    }

    static String firstSecond(Integer[] myArray) {
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        Integer second = null;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != first) {
                second = arr[i];
                break;
            }
        }
        return first+" "+second;
    }
}
