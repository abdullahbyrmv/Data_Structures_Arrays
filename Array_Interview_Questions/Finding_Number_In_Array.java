package Array_Interview_Questions;
import java.util.Scanner;

public class Finding_Number_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Please fill the array : ");
        for(int i = 0 ; i < intArray.length ; i++){
            intArray[i] = sc.nextInt();
        }
        System.out.print("Now please enter the value which you want to search for : ");
        int searched_number = sc.nextInt();
        linearSearch(intArray, searched_number);

    }

    public static void linearSearch(int[] intArray, int value) {
        for(int i=0; i<intArray.length; i++) {
            if (intArray[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }
}
