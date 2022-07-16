package Classic_Array_Questions;

public class Diagonal_Sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonal(arr));
    }
    public static int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i=0; i<a.length;i++) {
            sum+= a[i][i];
        }
        return sum;
    }
}
