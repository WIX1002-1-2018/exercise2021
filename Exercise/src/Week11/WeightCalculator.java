package Week11;

public class WeightCalculator {

    private int age;
    private double height, weight;

    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double weight() {
        return (this.height - 100 + age / (double) 10) * 0.9;
    }

    @Override
    public String toString() {
        return "Age: " + age +
                "\nHeight: " + height + "cm" +
                "\nRecommend weight: " + weight() + "kg";
    }
}
