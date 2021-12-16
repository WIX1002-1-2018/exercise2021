package Week08;

public class q1 {

    public static void main(String[] args) {

        // Write a Java method that returns a triangular number. A triangular number is defined
        // as 1+2+3+…+ n. Then, write a Java program to use the method to display the first 20
        // triangular numbers.
        triangularNumber(20);
    }

    public static void triangularNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.print(sum + " ");
        }
    }
}
