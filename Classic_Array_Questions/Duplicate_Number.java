package Classic_Array_Questions;
import java.util.Scanner;

public class Duplicate_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Please fill the array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] newArray = removeDuplicates(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    private static int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];
        return j;
    }

    public static int[] removeDuplicates(int[] arr) {

        int result = removeDuplicates(arr, arr.length);
        int[] newArray = new int[result];

        for (int i = 0; i < result; i++) {
            newArray[i] = arr[i];
        }
        return newArray;

    }
}
