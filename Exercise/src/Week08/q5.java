package Week08;

import java.util.Random;
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {

        // Write a Java method that accepts three parameters, the method will compare whether
        //the third parameter value is equal to the multiplication of parameter 1 and parameter
        //2. Then, write a Java multiplication game for any random number within 0 – 12
        Random ac = new Random();
        Scanner sc = new Scanner(System.in);
        int answer = 1, score = 0, multiple1, multiple2;
        while (answer >= 0) {
            multiple1 = ac.nextInt(13);
            multiple2 = ac.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(multiple1 + " * " + multiple2 + " = ");
            answer = sc.nextInt();
            if (answerIsCorrect(multiple1, multiple2, answer)) {
                score += 1;
            }
        }
        System.out.println("Your score is " + score);
    }

    public static boolean answerIsCorrect(int multiple1, int multiple2, int answer) {
        return answer == multiple1 * multiple2;
    }
}
