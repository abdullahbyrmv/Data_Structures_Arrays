package Array_Interview_Questions;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of first array : ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Please fill the first array : ");
        for(int i = 0 ; i < array1.length ; i++){
            array1[i] = sc.nextInt();
        }
        System.out.print("Input the size of second array : ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.print("Please fill the second array : ");
        for(int i = 0 ; i < array2.length ; i++){
            array2[i] = sc.nextInt();
        }
        boolean result = permutation(array1, array2);
        System.out.println(result);
    }

    // Array_Interview_Questions.Permutation
    public static boolean permutation(int[] array1, int[] array2){
        if (array1.length != array2.length ) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        for (int i = 0; i<array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }
        if (sum1 == sum2 && mul1 == mul2) {
            return true;
        }
        return false;
    }
}
