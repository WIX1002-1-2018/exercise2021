package Week08;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        //Write a Java method that implements Euclidean Algorithm to return the greatest
        //common divisor of two positive integers. Then, write a program to get the GCD for
        //(25, 8) and (200, 625)
        int gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: ");
        int a = sc.nextInt();
        System.out.print("Second Number: ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " = " + findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        int gcd = 0, m, n;
        m = Math.max(a, b);
        n = Math.min(a, b);
        gcd = n;
        while (m % n != 0) { // until no remainder
            gcd = m % n;
            m = n;
            n = gcd;
        }
        return gcd;
    }
}

