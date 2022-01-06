package Week11;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Q1
        Number a = new Number();
        a.showAll();
        a.showEven();
        a.showPrime();
        a.showMax();
        a.showMin();
        a.average();
        a.showSquare();
        System.out.println();

        Number b = new Number(5);
        b.showAll();
        b.showEven();
        b.showPrime();
        b.showMax();
        b.showMin();
        b.average();
        b.showSquare();
        System.out.println();

        Number c = new Number(4,50);
        c.showAll();
        c.showEven();
        c.showPrime();
        c.showMax();
        c.showMin();
        c.average();
        c.showSquare();

        //Q2
        Scanner sc = new Scanner(System.in);
        System.out.println("Open Savings Account: ");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter IC or passport number: ");
        String Ic = sc.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double amount = sc.nextDouble();
        BankAccount acc = new BankAccount(name, Ic, amount);
        System.out.println("Enter D to deposit, W to withdraw, C to check balance, Q to quit");
        String input = sc.next();

        while (!input.equalsIgnoreCase("q")) {
            switch (input) {
                case "D":
                case "d":
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();
                    if (acc.deposit(amount)) {
                        System.out.println("Deposit: " + amount);
                    } else {
                        System.out.println("Amount entered is unacceptable");
                    }
                    break;
                case "W":
                case "w":
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();
                    if(acc.withdraw(amount)){
                        System.out.println("Withdraw: " + amount);
                    }
                    else {
                        System.out.println("Amount entered is unacceptable");
                    }
                    break;
                case "C":
                case "c":
                    acc.checkBalance();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Enter D to deposit, W to withdraw, C to check balance, Q to quit");
            input = sc.next();
        }

        //Q3
        WeightCalculator cal = new WeightCalculator(20, 175);
        System.out.println(cal.toString());

        //Q4
        Fraction a = new Fraction();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();
        a.setNumerator(numerator);
        a.setDenominator(denominator);
        System.out.println("Numerator: " + a.getNumerator());
        System.out.println("Denominator: " + a.getDenominator());
        a.DisplayFraction();


        //Q5
        Game player1 = new Game("Jia Hong");
        Game player2 = new Game("Kay Li");
        int round = 1;
        while (true) {
            System.out.println("Round: " + round);
            player1.roll();
            if (player1.isWin()) {
                break;
            }
            player2.roll();
            if (player2.isWin()) {
                break;
            }
            System.out.println();
            round++;
        }

        //Q6
        BurgerStall stall1 = new BurgerStall("A1");
        BurgerStall stall2 = new BurgerStall("B2");
        BurgerStall stall3 = new BurgerStall("C3");
        stall1.sold(200);
        stall2.sold(300);
        stall3.sold(500);
        stall1.display();
        stall2.display();
        stall3.display();
        System.out.println(stall1.toString());

        //Q7
        Money money1 = new Money(102.21);
        money1.roundUp();
        money1.calculate();
        money1.displayAmount();

        Money money2 = new Money(51);
        money2.roundUp();
        money2.calculate();
        money2.displayAmount();

        Money subtractMoney = Money.subtraction(money1, money2);
        subtractMoney.calculate();
        subtractMoney.displayAmount();

        Money additionMoney = Money.addition(money1, money2);
        additionMoney.calculate();
        additionMoney.displayAmount();
    }
}
