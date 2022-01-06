package Week11;

import java.util.Random;

public class Game {

    private Random ac = new Random();
    private String name;
    private int score = 0;

    public Game(String name) {
        this.name = name;
    }

    public void roll() {
        int dice = ac.nextInt(6) + 1;
        System.out.println(this.name + " rolls " + dice);
        score += dice;
        System.out.println("Current score: " + score);
    }

    public boolean isWin() {
        if (this.score >= 100) {
            System.out.println(this.name + " wins");
        }
        return this.score >= 100;
    }

}
