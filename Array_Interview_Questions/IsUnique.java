package Array_Interview_Questions;
import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Please fill the array : ");
        for(int i = 0 ; i < intArray.length ; i++){
            intArray[i] = sc.nextInt();
        }
        boolean result = isUnique(intArray);
        System.out.println(result);
    }

    // Is Unique
    public static boolean isUnique(int[] intArray) {
        for (int i =0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
