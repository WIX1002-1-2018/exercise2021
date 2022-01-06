package Week11;

import java.util.Random;

public class Number {

    private int[] num;
    private int occurrence = 10;
    private int maximum = 100;

    public Number() {
        num = new int[occurrence];
        generate();
    }

    public Number(int occ) {
        occurrence = occ;
        num = new int[occurrence];
        generate();
    }

    public Number(int occ, int max) {
        occurrence = occ;
        num = new int[occurrence];
        maximum = max;
        generate();
    }

    public void generate() {
        Random ac = new Random();
        for (int i = 0; i < occurrence; i++) {
            num[i] = ac.nextInt(maximum + 1);
        }
    }

    public void showMin() {
        System.out.print("Minimum number: ");
        int min = num[0];
        for (int i = 1; i < occurrence; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.print(min);
        System.out.println();
    }

    public void showMax() {
        System.out.print("Maximum number: ");
        int max = num[0];
        for (int i = 0; i < occurrence; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.print(max);
        System.out.println();
    }

    public void average() {
        System.out.print("Average: ");
        int sum = 0;
        for (int i = 0; i < occurrence; i++) {
            sum += num[i];
        }
        System.out.printf("%.2f\n", sum / (double) occurrence);
    }

    public void showEven() {
        System.out.print("Even number: ");
        for (int i = 0; i < occurrence; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

    public void showPrime() {
        System.out.print("Prime number: ");
        for (int i = 0; i < occurrence; i++) {
            if (isPrime(num[i])) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < occurrence; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void showSquare() {
        System.out.print("Square number: ");
        for (int i = 0; i < occurrence; i++) {
            if (isSquare(num[i])) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean isSquare(int num) {
        int n = (int) (Math.sqrt(num));
        if (Math.pow(n, 2) == num) {
            return true;
        }
        return false;
    }

    public void showAll() {
        System.out.print("All: ");
        for (int i = 0; i < occurrence; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
