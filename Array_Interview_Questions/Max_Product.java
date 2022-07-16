package Array_Interview_Questions;
import java.util.Scanner;

public class Max_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Please fill the array : ");
        for(int i = 0 ; i < intArray.length ; i++){
            intArray[i] = sc.nextInt();
        }
        String pairs = maxProduct(intArray);
        System.out.println(pairs);

    }

    // Max Product
    public static String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i]*intArray[j]>maxProduct) {
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
