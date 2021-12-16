package Week08;

public class q3 {

    public static void main(String[] args) {

        //Write a Java method that accepts an array of 10 integers. The method should reverse
        //the integer in the array. Example, if the number is 1234, the number will change to
        //4321.
        int[] array = {12, 23, 34, 45, 56, 67, 78, 89, 29, 1234};
        System.out.print("Original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        reverseNumber(array);
        System.out.print("\nReversed: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int reversed = 0;
            while (array[i] != 0) {  // 1234 123
                int digit = array[i] % 10; // 3
                reversed = reversed * 10 + digit; // 40 + 3 4321
                array[i] /= 10;

            }
            array[i] = reversed;
        }
    }


}
