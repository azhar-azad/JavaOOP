package ClassAndObject2;

public class TestClassAndObject2 {

    public static void main(String[] args) {

        Stock stock = new Stock("BDT", "Bangladesh House Building Finance Corporation", 34.5, 34.35);
        System.out.printf("Price-change percentage: %.2f", stock.getChangePercent());
    }
}
