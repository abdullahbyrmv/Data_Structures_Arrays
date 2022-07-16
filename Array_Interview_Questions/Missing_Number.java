package Array_Interview_Questions;

class Missing_Number {
    public static void main(String[] args) {
        Missing_Number main = new Missing_Number();
        System.out.println("Please fill the array with the numbers is an ascending order till 10 and miss one number. For example, 1,2,4,5,6,7,8,9");
        int intArray[] = {1,2,3, 4, 5, 6, 7, 8, 9};

        main.missingNumber(intArray);


    }

    public void missingNumber(int[] intArray) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i: intArray) {
            sum1 += i;
        }
        sum2 = 10*(10+1)/2;
        int difference = sum2 - sum1;
        System.out.println("Missing Number is " + difference);

    }
}
