package Week08;

public class q6 {

    public static void main(String[] args) {

        //Write a Java method that determine whether a number is a palindromic prime and
        //another method that determine whether a number is emirp (the number is a prime
        //number and the reverse also a prime number and is not palindromic prime). Then,
        //write a Java program to use the methods to display the first 20 palindromic prime and
        //emirp

        int start = 2;
        System.out.print("Palindromic prime: ");
        for (int i = 1; i <= 20; ) {
            if (palindromicPrime(start)) {
                System.out.print(start + " ");
                i++;
            }
            start++;
        }
        System.out.println();

        start = 2;
        System.out.print("Emirp: ");
        for (int i = 1; i <= 20; ) {
            if (emirp(start)) {
                System.out.print(start + " ");
                i++;
            }
            start++;
        }
    }

    public static boolean palindromicPrime(int a) {
        int reverse_num = reverse(a);
        if (a != reverse_num) {
            return false;
        }
        return isPrime(a);
    }

    public static boolean emirp(int a) {
        int reverse_num = reverse(a);
        if (a == reverse_num) {
            return false;
        }
        return isPrime(a) && isPrime(reverse_num);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num) {
        int reverse_num = 0;
        while (num != 0) {
            reverse_num = reverse_num * 10 + num % 10;
            num /= 10;
        }
        return reverse_num;
    }

}
