package Week11;

public class BurgerStall {

    private String ID;
    private int numBurger = 0;
    private static int sumBurger = 0;

    public BurgerStall(String ID) {
        this.ID = ID;
    }

    public void sold(int n) {
        numBurger += n;
        sumBurger += n;
    }

    public void display() {
        System.out.println("The number of burger sold by stall " + this.ID + ": " + numBurger);
    }

    @Override
    public String toString() {
        return "The total number of burgers sold in all stalls: " + sumBurger;
    }
}
