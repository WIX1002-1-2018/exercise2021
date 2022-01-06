package Week11;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void DisplayFraction() {
        int GCD = 1, max;
        if (denominator >= numerator) {
            max = denominator;
        } else {
            max = numerator;
        }
        for (int i = max; i >= 2; i--) {
            if (denominator % i == 0 && numerator % i == 0) {
                GCD = i;
                break;
            }
        }
        denominator /= GCD;
        numerator /= GCD;
        System.out.println("The simplest fraction is " + numerator +
                " / " + denominator);
    }
}


