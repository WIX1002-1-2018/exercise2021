package Week08;

public class q2 {

    public static void main(String[] args) {

        //Write a Java method multiPrint(int n, char c) that prints n copies of character c. Then,
        //write a Java program to use the method to display the triangles and diamonds.

        for (int i = 0; i < 5; i++) {
            multiPrint(5 - i, ' ');
            multiPrint(i + 1 + i, '*');
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            multiPrint(4 - i, ' ');
            multiPrint(i + 1 + i, '*');
            System.out.println();
        }

        for (int i = 4; i >= 0; i--) {
            multiPrint(4 - i, ' ');
            multiPrint(i + 1 + i, '*');
            System.out.println();
        }


    }

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
